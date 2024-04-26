package pe.edu.upc.qalikay.dtos;

import jakarta.persistence.*;
import pe.edu.upc.qalikay.entities.Sp_recipe;
import pe.edu.upc.qalikay.entities.User;

import java.time.LocalDate;

public class CommentDTO {
    private int idComment;
    private String userType;
    private String textComment;
    private LocalDate dateComment;
    private int qualification;
    private User user;
    private Sp_recipe spRecipe;

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public LocalDate getDateComment() {
        return dateComment;
    }

    public void setDateComment(LocalDate dateComment) {
        this.dateComment = dateComment;
    }

    public int getQualification() {
        return qualification;
    }

    public void setQualification(int qualification) {
        this.qualification = qualification;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Sp_recipe getSpRecipe() {
        return spRecipe;
    }

    public void setSpRecipe(Sp_recipe spRecipe) {
        this.spRecipe = spRecipe;
    }
}
