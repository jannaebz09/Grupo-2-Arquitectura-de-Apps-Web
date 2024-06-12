package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.DetailSaleDTO;

import pe.edu.upc.qalikay.dtos.DetailSaleWithoutSubtotalDTO;
import pe.edu.upc.qalikay.entities.DetailSale;

import pe.edu.upc.qalikay.servicesinterfaces.IDetailSaleService;


import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/DetailSales")
@RestController
public class DetailSaleController {

    @Autowired
    public IDetailSaleService dS;
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO','CLIENTE')")
    @PostMapping
    public void registrar(@RequestBody DetailSaleWithoutSubtotalDTO s){
        ModelMapper m=new ModelMapper();
        DetailSale de=m.map(s, DetailSale.class);
        dS.insert(de);
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO','CLIENTE')")
    @PutMapping
    public void modificar(@RequestBody DetailSaleWithoutSubtotalDTO s){
        ModelMapper m=new ModelMapper();
        DetailSale de=m.map(s, DetailSale.class);
        dS.insert(de);
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO','CLIENTE')")
    @GetMapping
    public List<DetailSaleDTO> list (){
        return dS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, DetailSaleDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO','CLIENTE')")
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
