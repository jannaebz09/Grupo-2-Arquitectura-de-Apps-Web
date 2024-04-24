package pe.edu.upc.qalikay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.qalikay.entities.Sale;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ISaleRepository extends JpaRepository<Sale,Integer>{
    @Query(value = "Select u.full_name as Usuario, count(*) as Cantidad\n " +
            "from sale s inner join usert u\n " +
            "on s.id_user = u.id_user \n " +
            "group by u.full_name ",nativeQuery = true)
    public List<String[]> quantitySaleByUser();
    @Query(value = "SELECT SUM(s.amount) FROM Sale s" , nativeQuery = true)
    long sumTotalSales();
    public List<Sale>findSalesBySaleDateEquals(LocalDate date);

    @Query("SELECT s.user, COUNT(s) as saleCount FROM Sale s WHERE s.saleDate BETWEEN :Dia_inicial AND :Dia_final GROUP BY s.user ORDER BY saleCount DESC")
    List<Object[]> findTopUsersWithMostSales(@Param("Dia_inicial") LocalDate Dia_inicial, @Param("Dia_final") LocalDate Dia_final);

}