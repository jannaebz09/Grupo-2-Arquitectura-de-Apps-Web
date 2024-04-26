package pe.edu.upc.qalikay.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.qalikay.entities.Sp_recipe;

import java.util.List;

@Repository
public interface ISp_recipeRepository extends JpaRepository<Sp_recipe, Integer >{
    @Query(value = "SELECT s.id_special_recipe, s.description, AVG(c.qualification) AS average_qualification \n" +
            "FROM sp_recipe s \n" +
            "JOIN \"comment\" c ON s.id_special_recipe = c.id_special_recipe \n" +
            "GROUP BY s.id_special_recipe, s.description \n" +
            "ORDER BY average_qualification DESC ",nativeQuery = true)
    public List<String[]> orderByQualificationAverage();
}
