package pe.edu.upc.qalikay.dtos;

import pe.edu.upc.qalikay.entities.User;

import java.time.LocalDate;

public class Sp_recipeDTO {
    private int idSpecialRecipe;

    private String description;

    private LocalDate shippingDate;

    private User user;

    public int getIdSpecialRecipe() {
        return idSpecialRecipe;
    }

    public void setIdSpecialRecipe(int idSpecialRecipe) {
        this.idSpecialRecipe = idSpecialRecipe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
