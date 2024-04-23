package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.qalikay.dtos.ProductDTO;

import pe.edu.upc.qalikay.entities.Product;

import pe.edu.upc.qalikay.servicesinterfaces.IProductService;


import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/Products")
@RestController
public class ProductController {
    @Autowired
    public IProductService sS;
    @PostMapping
    public void registrar(@RequestBody ProductDTO s){
        ModelMapper m=new ModelMapper();
        Product sh=m.map(s, Product.class);
        sS.insert(sh);
    }
    @PutMapping
    public void modificar(@RequestBody ProductDTO s){
        ModelMapper m=new ModelMapper();
        Product sh=m.map(s, Product.class);
        sS.insert(sh);
    }
    @GetMapping
    public List<ProductDTO> list (){
        return sS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, ProductDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminacion(@PathVariable("id")Integer id){
        sS.delete(id);
    }
    @GetMapping("/{id}")
    public ProductDTO listadoId(@PathVariable ("id")Integer id){
        ModelMapper m= new ModelMapper();
        ProductDTO dto=m.map(sS.listId(id),ProductDTO.class);
        return dto;
    }
    @GetMapping("/buscar")
    public List<ProductDTO> buscarModelo(@RequestParam String nombre){

        return sS.findByNameProduct(nombre).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ProductDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/cantidadtotal")
    public long countTotalProducts() {
        return sS.countTotalProducts();
    }
}
