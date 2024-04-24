package pe.edu.upc.qalikay.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.ExpCertificateDTO;
import pe.edu.upc.qalikay.dtos.QualificationAverageByUserDTO;
import pe.edu.upc.qalikay.dtos.QuantityUserByInstitutionNameDTO;
import pe.edu.upc.qalikay.entities.ExpCertificate;
import pe.edu.upc.qalikay.servicesinterfaces.IExpCertificateService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ExpCertificates")
public class ExpCertificateController {
    @Autowired
    private IExpCertificateService sS;
    @PostMapping
    public void registrar(@RequestBody ExpCertificateDTO s){
        ModelMapper m=new ModelMapper();
        ExpCertificate ex=m.map(s,ExpCertificate.class);
        sS.insert(ex);
    }
    @PutMapping
    public void modificar(@RequestBody ExpCertificateDTO s){
        ModelMapper m=new ModelMapper();
        ExpCertificate ex=m.map(s,ExpCertificate.class);
        sS.insert(ex);
    }
    @GetMapping
    public List<ExpCertificateDTO> list(){

        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ExpCertificateDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public ExpCertificateDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        ExpCertificateDTO dto=m.map(sS.listId(id),ExpCertificateDTO.class);
        return dto;
    }
    @GetMapping("/usuariosxinstitucion")
    public List<QuantityUserByInstitutionNameDTO> cantidadUsuariosPorInstitucion(){
        List<String[]> filaLista=sS.quantityUserbyInstitutionName();
        List<QuantityUserByInstitutionNameDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            QuantityUserByInstitutionNameDTO dto=new QuantityUserByInstitutionNameDTO();
            dto.setIntitutionName(columna[0]);
            dto.setQuantity(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
