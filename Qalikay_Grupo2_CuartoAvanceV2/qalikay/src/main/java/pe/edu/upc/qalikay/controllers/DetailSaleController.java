package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.DetailSaleDTO;

import pe.edu.upc.qalikay.entities.DetailSale;

import pe.edu.upc.qalikay.servicesinterfaces.IDetailSaleService;


import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/DetailSales")
@RestController
public class DetailSaleController {

    @Autowired
    public IDetailSaleService dS;
    @PostMapping
    public void registrar(@RequestBody DetailSaleDTO s){
        ModelMapper m=new ModelMapper();
        DetailSale de=m.map(s, DetailSale.class);
        dS.insert(de);
    }
    @PutMapping
    public void modificar(@RequestBody DetailSaleDTO s){
        ModelMapper m=new ModelMapper();
        DetailSale de=m.map(s, DetailSale.class);
        dS.insert(de);
    }
    @GetMapping
    public List<DetailSale> list (){
        return dS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, DetailSale.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminacionDetalleVenta(@PathVariable("id")Integer id){
        dS.delete(id);
    }
    @GetMapping("/{id}")
    public DetailSaleDTO listadoId(@PathVariable ("id")Integer id){
        ModelMapper m= new ModelMapper();
        DetailSaleDTO dto=m.map(dS.listId(id),DetailSaleDTO.class);
        return dto;
    }
}
