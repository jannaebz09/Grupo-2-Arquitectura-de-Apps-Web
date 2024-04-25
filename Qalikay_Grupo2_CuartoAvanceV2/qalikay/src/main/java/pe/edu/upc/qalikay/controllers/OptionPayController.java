package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.OptionPayDTO;

import pe.edu.upc.qalikay.entities.OptionPay;

import pe.edu.upc.qalikay.servicesinterfaces.IOptionPayService;


import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/OptionPays")
@RestController
public class OptionPayController {
    @Autowired
    public IOptionPayService oS;
    @PostMapping
    public void registrar(@RequestBody OptionPayDTO s){
        ModelMapper m=new ModelMapper();
        OptionPay op=m.map(s, OptionPay.class);
        oS.insert(op);
    }
    @PutMapping
    public void modificar(@RequestBody OptionPayDTO s){
        ModelMapper m=new ModelMapper();
        OptionPay op=m.map(s, OptionPay.class);
        oS.insert(op);
    }
    @GetMapping
    public List<OptionPayDTO> list (){
        return oS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, OptionPayDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminacion(@PathVariable("id")Integer id){
        oS.delete(id);
    }
    @GetMapping("/{id}")
    public OptionPayDTO listadoId(@PathVariable ("id")Integer id){
        ModelMapper m= new ModelMapper();
        OptionPayDTO dto=m.map(oS.listId(id),OptionPayDTO.class);
        return dto;
    }
    @GetMapping("/listarportarjeta")
    public List<OptionPayDTO> buscarxtarjeta(){
        return oS.listaxtarjeta().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x,OptionPayDTO.class);
        }).collect(Collectors.toList());
    }
}
