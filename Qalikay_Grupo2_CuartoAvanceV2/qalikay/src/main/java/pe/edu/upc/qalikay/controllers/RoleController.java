package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.qalikay.dtos.RoleDTO;

import pe.edu.upc.qalikay.entities.Role;

import pe.edu.upc.qalikay.servicesinterfaces.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/Roles")
@RestController
public class RoleController {
    @Autowired
    public IRoleService sS;
    @PostMapping
    public void registrarRole(@RequestBody Role s){
        ModelMapper m=new ModelMapper();
        Role sh=m.map(s, Role.class);
        sS.insert(sh);
    }
    @PutMapping
    public void modificar(@RequestBody Role s){
        ModelMapper m=new ModelMapper();
        Role sh=m.map(s, Role.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<RoleDTO> listRole (){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, RoleDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminacionRol(@PathVariable("id")Integer id){
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public RoleDTO listadoIdRol(@PathVariable ("id")Integer id){
        ModelMapper m= new ModelMapper();
       RoleDTO dto=m.map(sS.listId(id),RoleDTO.class);
        return dto;
    }
}
