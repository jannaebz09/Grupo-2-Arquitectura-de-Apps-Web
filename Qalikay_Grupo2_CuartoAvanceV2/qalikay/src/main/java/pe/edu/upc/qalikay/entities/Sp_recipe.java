package pe.edu.upc.qalikay.entities;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Sp_recipe")
public class Sp_recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSpecialRecipe;
    @Column(name = "description", nullable = false, length = 100)
    private String description;
    @Column(name = "shippingDate",nullable = false)
    private LocalDate shippingDate;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    public Sp_recipe(){

    }

    public Sp_recipe(int idSpecialRecipe, String description, LocalDate shippingDate, User user) {
        this.idSpecialRecipe = idSpecialRecipe;
        this.description = description;
        this.shippingDate = shippingDate;
        this.user = user;
    }

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

