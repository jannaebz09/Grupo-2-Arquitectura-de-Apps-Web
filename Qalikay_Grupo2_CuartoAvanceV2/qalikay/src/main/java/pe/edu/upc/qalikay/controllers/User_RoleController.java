package pe.edu.upc.qalikay.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.User_RoleDTO;
import pe.edu.upc.qalikay.entities.User_Role;
import pe.edu.upc.qalikay.servicesinterfaces.IUser_RoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/User_Roles")
public class User_RoleController {
    @Autowired
    private IUser_RoleService sS;
    @PostMapping
    public void registrar(@RequestBody User_RoleDTO s){
        ModelMapper m=new ModelMapper();
        User_Role us=m.map(s, User_Role.class);
        sS.insert(us);
    }
    @PutMapping
    public void modificar(@RequestBody User_RoleDTO s){
        ModelMapper m=new ModelMapper();
        User_Role us=m.map(s, User_Role.class);
        sS.insert(us);
    }
    @GetMapping
    public List<User_RoleDTO> list(){

        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, User_RoleDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public User_RoleDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        User_RoleDTO dto=m.map(sS.listId(id), User_RoleDTO.class);
        return dto;
    }
}
