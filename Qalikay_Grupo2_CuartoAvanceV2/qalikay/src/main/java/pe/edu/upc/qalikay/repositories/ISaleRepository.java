package pe.edu.upc.qalikay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.qalikay.entities.Sale;

import java.util.List;

@Repository
public interface ISaleRepository extends JpaRepository<Sale,Integer>{
    @Query(value = "Select u.full_name as Usuario, count(*) as Cantidad\n " +
            "from sale s inner join usert u\n " +
            "on s.id_user = u.id_user \n " +
            "group by u.full_name ",nativeQuery = true)
    public List<String[]> quantitySaleByUser();
}