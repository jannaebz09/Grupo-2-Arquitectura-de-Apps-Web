package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.SaleByUserDTO;
import pe.edu.upc.qalikay.dtos.SaleDTO;

import pe.edu.upc.qalikay.dtos.SaleWithoutTotalDTO;
import pe.edu.upc.qalikay.dtos.TopUsersWithMostSalesDTO;
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
    public void registrar(@RequestBody SaleWithoutTotalDTO s){
        ModelMapper m=new ModelMapper();
        Sale sa=m.map(s, Sale.class);
        sS.insert(sa);
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO')")
    @PutMapping
    public void modificar(@RequestBody SaleWithoutTotalDTO s){
        ModelMapper m=new ModelMapper();
        Sale sa=m.map(s, Sale.class);
        sS.insert(sa);
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO')")
    @GetMapping
    public List<SaleDTO> list (){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, SaleDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO')")
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
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO')")
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
    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/sumatotal")
    public double sumTotalSales(@RequestParam LocalDate Dia_inicial, @RequestParam LocalDate Dia_final){
        return sS.sumTotalSales(Dia_inicial,Dia_final);
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO')")
    @GetMapping("/buscarventaporfecha")
    public List<SaleDTO> buscarventaporfecha(@RequestParam LocalDate date){
        return sS.findSalesBySaleDateEquals(date).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, SaleDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO')")
    @GetMapping("/UsuariosTop")
    public List<TopUsersWithMostSalesDTO> getTopUsersWithMostSales(@RequestParam LocalDate Dia_inicial, @RequestParam LocalDate Dia_final){
        List<String[]> filaLista=sS.findTopUsersWithMostSales(Dia_inicial,Dia_final);
        List<TopUsersWithMostSalesDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            TopUsersWithMostSalesDTO dto=new TopUsersWithMostSalesDTO();
            dto.setIdUser(Integer.parseInt(columna[0]));
            dto.setFullname(columna[1]);
            dto.setQuantity(Integer.parseInt(columna[2]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
