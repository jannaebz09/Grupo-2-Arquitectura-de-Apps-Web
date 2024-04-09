package pe.edu.upc.qalikay.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.CommentDTO;
import pe.edu.upc.qalikay.entities.Comment;
import pe.edu.upc.qalikay.servicesinterfaces.ICommentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Comments")
public class CommentController {
    @Autowired
    private ICommentService sS;
    @PostMapping
    public void registrar(@RequestBody CommentDTO s){
        ModelMapper m=new ModelMapper();
        Comment co=m.map(s,Comment.class);
        sS.insert(co);
    }
    @GetMapping
    public List<CommentDTO> list(){

        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,CommentDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public CommentDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        CommentDTO dto=m.map(sS.listId(id),CommentDTO.class);
        return dto;
    }
}
