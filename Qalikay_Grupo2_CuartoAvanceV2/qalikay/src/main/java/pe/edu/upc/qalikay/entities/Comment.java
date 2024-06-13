package pe.edu.upc.qalikay.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name="Comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;
    @Column(name="textComment",nullable = false)
    private String textComment;
    @Column(name="dateComment",nullable = false)
    private LocalDate dateComment;
    @Column(name="qualification",nullable = false)
    private int qualification;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
    @ManyToOne
    @JoinColumn(name = "idSpecialRecipe")
    private Sp_recipe spRecipe;

    public Comment() {
    }

    public Comment(int idComment, String textComment, LocalDate dateComment, int qualification, User user, Sp_recipe spRecipe) {
        this.idComment = idComment;
        this.textComment = textComment;
        this.dateComment = dateComment;
        this.qualification = qualification;
        this.user = user;
        this.spRecipe = spRecipe;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
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
