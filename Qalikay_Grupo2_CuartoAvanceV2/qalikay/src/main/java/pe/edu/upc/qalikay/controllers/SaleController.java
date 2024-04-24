package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.SaleByUserDTO;
import pe.edu.upc.qalikay.dtos.SaleDTO;

import pe.edu.upc.qalikay.entities.Sale;

import pe.edu.upc.qalikay.servicesinterfaces.ISaleService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/Sales")
@RestController
public class SaleController {

    @Autowired
    public ISaleService sS;
    @PostMapping
    public void registrar(@RequestBody SaleDTO s){
        ModelMapper m=new ModelMapper();
        Sale sh=m.map(s, Sale.class);
        sS.insert(sh);
    }
    @PutMapping
    public void modificar(@RequestBody SaleDTO s){
        ModelMapper m=new ModelMapper();
        Sale sh=m.map(s, Sale.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<SaleDTO> list (){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, SaleDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminacion(@PathVariable("id")Integer id){
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public SaleDTO listadoId(@PathVariable ("id")Integer id){
        ModelMapper m= new ModelMapper();
        SaleDTO dto=m.map(sS.listId(id),SaleDTO.class);
        return dto;
    }
    @GetMapping("/cantidades")
    public List<SaleByUserDTO> cantidadVentas(){
        List<String[]> filaLista=sS.quantitySaleByUser();
        List<SaleByUserDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            SaleByUserDTO dto=new SaleByUserDTO();
            dto.setFullName(columna[0]);
            dto.setQuantitySale(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
    @GetMapping("/sumatotal")
    public long sumTotalSales(){
        return sS.sumTotalSales();
    }

    @GetMapping("/buscarventaporfecha")
    public List<SaleDTO> buscarventaporfecha(@RequestParam LocalDate date){
        return sS.findSalesBySaleDateEquals(date).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, SaleDTO.class);
        }).collect(Collectors.toList());
    }
}
