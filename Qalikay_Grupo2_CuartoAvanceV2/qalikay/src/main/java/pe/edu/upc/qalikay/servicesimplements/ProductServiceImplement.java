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
    private IProductRepository pR;

    @Override
    public void insert(Product product) {
        pR.save(product);
    }

    @Override
    public List<Product> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public Product listId(int id) {
        return pR.findById(id).orElse(new Product());
    }

    @Override
    public List<Product> findByNameProduct(String nombre) {
        return pR.findByNameProduct(nombre);
    }

    @Override
    public long countTotalProducts() {
        return pR.count();
    }

    @Override
    public List<Product> getProductsInPriceRange(double Precio_min, double Precio_max) {
        return pR.findByAmountProductBetween(Precio_min, Precio_max);
    }
}
