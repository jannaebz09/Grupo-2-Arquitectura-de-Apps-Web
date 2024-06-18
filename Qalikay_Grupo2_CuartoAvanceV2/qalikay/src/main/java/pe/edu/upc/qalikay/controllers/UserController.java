package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.UserDTO;
import pe.edu.upc.qalikay.dtos.UserWithoutPasswordDTO;
import pe.edu.upc.qalikay.entities.User;
import pe.edu.upc.qalikay.servicesinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;


@RequestMapping("/Users")
@RestController

public class UserController {
    @Autowired
    private IUserService uS;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping
    public void registrar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        User us = m.map(dto, User.class);
        String encodedPassword = passwordEncoder.encode(us.getPassword());
        us.setPassword(encodedPassword);
        uS.insert(us);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping
    public void modificar (@RequestBody UserDTO s) {
        ModelMapper m=new ModelMapper();
        User us=m.map(s, User.class);
        uS.insert(us);
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO','CLIENTE')")
    @GetMapping
    public List<UserWithoutPasswordDTO> list(){
        return uS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, UserWithoutPasswordDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id) {
        uS.delete(id);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/{id}")
    public UserWithoutPasswordDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        UserWithoutPasswordDTO dto=m.map(uS.listId(id), UserWithoutPasswordDTO.class);
        return dto;
    }

}
