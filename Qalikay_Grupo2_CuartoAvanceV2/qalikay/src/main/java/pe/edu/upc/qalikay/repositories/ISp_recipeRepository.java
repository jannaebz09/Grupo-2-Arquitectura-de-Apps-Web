package pe.edu.upc.qalikay.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.qalikay.entities.Sp_recipe;

@Repository
public interface ISp_recipeRepository extends JpaRepository<Sp_recipe, Integer >{
}
