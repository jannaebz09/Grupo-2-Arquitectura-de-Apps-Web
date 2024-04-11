package pe.edu.upc.qalikay.servicesinterfaces;

import pe.edu.upc.qalikay.entities.Product;

import java.util.List;

public interface IProductService {
    public void insert(Product product);
    public List<Product> list();

    public void delete(int id);
    public Product listId(int id);
    public List<Product> findByNameProduct(String nombre);

}
