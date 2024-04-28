package pe.edu.upc.qalikay.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.CommentDTO;
import pe.edu.upc.qalikay.dtos.QualificationAverageByUserDTO;
import pe.edu.upc.qalikay.dtos.SaleByUserDTO;
import pe.edu.upc.qalikay.entities.Comment;
import pe.edu.upc.qalikay.servicesinterfaces.ICommentService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Comments")
public class CommentController {
    @Autowired
    private ICommentService cS;
    @PostMapping
    public void registrar(@RequestBody CommentDTO s){
        ModelMapper m=new ModelMapper();
        Comment co=m.map(s,Comment.class);
        cS.insert(co);
    }
    @PutMapping
    public void modificar(@RequestBody CommentDTO s){
        ModelMapper m=new ModelMapper();
        Comment co=m.map(s,Comment.class);
        cS.insert(co);
    }
    @GetMapping
    public List<CommentDTO> list(){

        return cS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,CommentDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public CommentDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        CommentDTO dto=m.map(cS.listId(id),CommentDTO.class);
        return dto;
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO')")
    @GetMapping("/promedio")
    public List<QualificationAverageByUserDTO> promedioCalificacion(){
        List<String[]> filaLista=cS.averageByUser();
        List<QualificationAverageByUserDTO> dtoLista=new ArrayList<>();
        for(String[] columna:filaLista){
            QualificationAverageByUserDTO dto=new QualificationAverageByUserDTO();
            dto.setFullName(columna[0]);
            dto.setAverage(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/listaCalificacionmayor3")
    public List<CommentDTO> buscar3() {
        return cS.listacalfmayor3().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CommentDTO.class);
        }).collect(Collectors.toList());
    }

}
