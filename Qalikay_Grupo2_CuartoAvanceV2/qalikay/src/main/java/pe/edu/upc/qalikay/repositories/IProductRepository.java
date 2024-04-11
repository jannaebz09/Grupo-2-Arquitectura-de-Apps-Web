package pe.edu.upc.qalikay.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.qalikay.entities.Product;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository <Product , Integer > {
    public List<Product> findByNameProduct(String nombre);
}
