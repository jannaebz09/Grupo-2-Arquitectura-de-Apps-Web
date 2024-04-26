package pe.edu.upc.qalikay.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.qalikay.entities.DetailSale;

@Repository
public interface IDetailSaleRepository extends JpaRepository<DetailSale, Integer> {
    @Transactional
    @Modifying
    @Query(value = "UPDATE sale SET total = (SELECT COALESCE(SUM(subtotal) * 1.18, 0) FROM detail_sale WHERE id_sale = sale.id_sale)", nativeQuery = true)
    public void actualizacionTotal();
    @Transactional
    @Modifying
    @Query(value = "UPDATE detail_sale  \n" +
            "SET subtotal = (  \n" +
            "SELECT COALESCE(SUM(p.amount_product*detail_Sale.quantity), 0) \n" +
            "FROM product p   \n" +
            "WHERE p.id_Product = detail_sale.id_producto) ", nativeQuery = true)
    public void actualizacionSubTotal();
}
