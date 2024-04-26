package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.UserDTO;
import pe.edu.upc.qalikay.entities.User;
import pe.edu.upc.qalikay.servicesinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;


@RequestMapping("/Users")
@RestController

public class UserController {
    @Autowired
    private IUserService uS;
    @PostMapping
    public void registrar (@RequestBody User s) {
        ModelMapper m=new ModelMapper();
        User us=m.map(s, User.class);
        uS.insert(us);
    }
    @PutMapping
    public void modificar (@RequestBody User s) {
        ModelMapper m=new ModelMapper();
        User us=m.map(s, User.class);
        uS.insert(us);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping
    public List<UserDTO> list(){
        return uS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id) {
        uS.delete(id);
    }
    @GetMapping("/{id}")
    public UserDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        UserDTO dto=m.map(uS.listId(id), UserDTO.class);
        return dto;
    }

}
