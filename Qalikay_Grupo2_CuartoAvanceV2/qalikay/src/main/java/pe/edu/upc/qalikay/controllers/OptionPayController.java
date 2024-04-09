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
    public IOptionPayService sS;
    @PostMapping
    public void registrar(@RequestBody OptionPayDTO s){
        ModelMapper m=new ModelMapper();
        OptionPay sh=m.map(s, OptionPay.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<OptionPayDTO> list (){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, OptionPayDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminacion(@PathVariable("id")Integer id){
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public OptionPayDTO listadoId(@PathVariable ("id")Integer id){
        ModelMapper m= new ModelMapper();
        OptionPayDTO dto=m.map(sS.listId(id),OptionPayDTO.class);
        return dto;
    }
}
