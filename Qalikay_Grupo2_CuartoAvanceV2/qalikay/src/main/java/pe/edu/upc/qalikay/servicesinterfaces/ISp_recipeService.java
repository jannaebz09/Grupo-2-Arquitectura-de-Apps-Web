package pe.edu.upc.qalikay.servicesinterfaces;

import pe.edu.upc.qalikay.entities.Sp_recipe;

import java.util.List;
public interface ISp_recipeService {
    public void insert (Sp_recipe sp_recipe);
    public List<Sp_recipe> list();
    public void delete(int id);
    public Sp_recipe listId(int id);
}
