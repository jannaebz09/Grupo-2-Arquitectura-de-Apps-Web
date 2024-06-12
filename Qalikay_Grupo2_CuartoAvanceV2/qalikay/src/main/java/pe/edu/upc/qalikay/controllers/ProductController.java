package pe.edu.upc.qalikay.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
    public IProductService pS;
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO')")
    @PostMapping
    public void registrar(@RequestBody ProductDTO s){
        ModelMapper m=new ModelMapper();
        Product pr=m.map(s, Product.class);
        pS.insert(pr);
    }
    @PutMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO')")
    public void modificar(@RequestBody ProductDTO s){
        ModelMapper m=new ModelMapper();
        Product pr=m.map(s, Product.class);
        pS.insert(pr);
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO','CLIENTE')")
    @GetMapping
    public List<ProductDTO> list (){
        return pS.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y, ProductDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO')")
    @DeleteMapping("/{id}")
    public void eliminacion(@PathVariable("id")Integer id){
        pS.delete(id);
    }
    @GetMapping("/{id}")
    public ProductDTO listadoId(@PathVariable ("id")Integer id){
        ModelMapper m= new ModelMapper();
        ProductDTO dto=m.map(pS.listId(id),ProductDTO.class);
        return dto;
    }
    @GetMapping("/buscar")
    public List<ProductDTO> buscarProducto(@RequestParam String nombre){

        return pS.findByNameProduct(nombre).stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,ProductDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAnyAuthority('ADMIN', 'EXPERTO')")
    @GetMapping("/cantidadtotal")
    public long countTotalProducts() {
        return pS.countTotalProducts();
    }

    @GetMapping("/RangoPrecio")
    public List<ProductDTO> getProductsInPriceRange(@RequestParam double Precio_min, @RequestParam double Precio_max) {
        return pS.getProductsInPriceRange(Precio_min, Precio_max).stream().map(product -> {
            ModelMapper m = new ModelMapper();
            return m.map(product, ProductDTO.class);
        }).collect(Collectors.toList());
    }
}
