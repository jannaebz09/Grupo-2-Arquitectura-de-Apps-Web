package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.SaleByUserDTO;
import pe.edu.upc.qalikay.dtos.SaleDTO;

import pe.edu.upc.qalikay.entities.Sale;

import pe.edu.upc.qalikay.servicesinterfaces.ISaleService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        Sale sa=m.map(s, Sale.class);
        sS.insert(sa);
    }
    @PutMapping
    public void modificar(@RequestBody SaleDTO s){
        ModelMapper m=new ModelMapper();
        Sale sa=m.map(s, Sale.class);
        sS.insert(sa);
    }
    @GetMapping
    public List<Sale> list (){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, Sale.class);
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

    @GetMapping("/UsuariosTop")
    public ResponseEntity<List<Object[]>> getTopUsersWithMostSales(@RequestParam String Dia_inicial, @RequestParam String Dia_final) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate start = LocalDate.parse(Dia_inicial, formatter);
        LocalDate end = LocalDate.parse(Dia_final, formatter);
        List<Object[]> topUsers = sS.getUsersWithMostSales(start, end);
        return new ResponseEntity<>(topUsers, HttpStatus.OK);
    }
}
