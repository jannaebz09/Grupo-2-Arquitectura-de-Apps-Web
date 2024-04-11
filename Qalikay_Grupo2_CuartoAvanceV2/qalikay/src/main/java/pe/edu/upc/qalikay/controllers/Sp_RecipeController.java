package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.qalikay.dtos.Sp_recipeDTO;

import pe.edu.upc.qalikay.entities.Sp_recipe;
import pe.edu.upc.qalikay.servicesinterfaces.ISp_recipeService;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/Sp_recipes")
@RestController

public class Sp_RecipeController {
    @Autowired
    private ISp_recipeService sS;
    @PostMapping
    public void registrar (@RequestBody Sp_recipeDTO s){
        ModelMapper m=new ModelMapper();
        Sp_recipe sh=m.map(s, Sp_recipe.class);
        sS.insert(sh);
    }
    @PutMapping
    public void modificar (@RequestBody Sp_recipeDTO s){
        ModelMapper m=new ModelMapper();
        Sp_recipe sh=m.map(s, Sp_recipe.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<Sp_recipeDTO> list (){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,Sp_recipeDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public Sp_recipeDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        Sp_recipeDTO dto=m.map(sS.listId(id),Sp_recipeDTO.class);
        return dto;
    }
}
