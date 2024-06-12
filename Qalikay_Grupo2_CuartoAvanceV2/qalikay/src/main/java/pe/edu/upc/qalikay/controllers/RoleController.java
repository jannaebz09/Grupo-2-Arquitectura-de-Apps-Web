package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
    public IRoleService rS;
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO','CLIENTE')")
    @PostMapping
    public void registrarRole(@RequestBody RoleDTO role){
        ModelMapper m=new ModelMapper();
        Role ro=m.map(role, Role.class);
        rS.insert(ro);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @PutMapping
    public void modificar(@RequestBody RoleDTO role){
        ModelMapper m=new ModelMapper();
        Role ro=m.map(role, Role.class);
        rS.insert(ro);
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping
    public List<RoleDTO> listRole (){
        return rS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, RoleDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAuthority('ADMIN')")
    @DeleteMapping("/{id}")
    public void eliminacionRol(@PathVariable("id")Integer id){
        rS.delete(id);
    }
    @GetMapping("/{id}")
    public RoleDTO listadoIdRol(@PathVariable ("id")Integer id){
        ModelMapper m= new ModelMapper();
       RoleDTO dto=m.map(rS.listId(id),RoleDTO.class);
        return dto;
    }
}
