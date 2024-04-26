package pe.edu.upc.qalikay.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.qalikay.entities.Sp_recipe;
import pe.edu.upc.qalikay.repositories.ISp_recipeRepository;
import pe.edu.upc.qalikay.servicesinterfaces.ISp_recipeService;

import java.util.List;

@Service
public class Sp_recipeServiceImplement implements ISp_recipeService {

    @Autowired
    private ISp_recipeRepository sR;


    @Override
    public void insert(Sp_recipe sp_recipe) {
        sR.save(sp_recipe);

    }

    @Override
    public List<Sp_recipe> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);


    }

    @Override
    public Sp_recipe listId(int id) {
        return sR.findById(id).orElse(new Sp_recipe());
    }

    @Override
    public List<String[]> orderByQualificationAverage() {
        return sR.orderByQualificationAverage();
    }
}
