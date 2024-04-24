package pe.edu.upc.qalikay.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.qalikay.entities.Product;
import pe.edu.upc.qalikay.repositories.IProductRepository;
import pe.edu.upc.qalikay.servicesinterfaces.IProductService;

import java.util.List;

@Service
public class ProductServiceImplement implements IProductService {
    @Autowired
    private IProductRepository sR;

    @Override
    public void insert(Product product) {
        sR.save(product);
    }

    @Override
    public List<Product> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public Product listId(int id) {
        return sR.findById(id).orElse(new Product());
    }

    @Override
    public List<Product> findByNameProduct(String nombre) {
        return sR.findByNameProduct(nombre);
    }

    @Override
    public long countTotalProducts() {
        return sR.count();
    }

    @Override
    public List<Product> getProductsInPriceRange(double Precio_min, double Precio_max) {
        return sR.findByAmountProductBetween(Precio_min, Precio_max);
    }
}
