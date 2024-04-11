package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    private IUserService sS;
    @PostMapping
    public void registrar (@RequestBody UserDTO s) {
        ModelMapper m=new ModelMapper();
        User sh=m.map(s, User.class);
        sS.insert(sh);
    }
    @PutMapping
    public void modificar (@RequestBody UserDTO s) {
        ModelMapper m=new ModelMapper();
        User sh=m.map(s, User.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<UserDTO> list(){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id) {
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public UserDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        UserDTO dto=m.map(sS.listId(id), UserDTO.class);
        return dto;
    }

}
