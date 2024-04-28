package pe.edu.upc.qalikay.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Role", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","rol"})})
public class Role {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    @Column(name = "descriptionRole", nullable = false, length = 50)
    private String descriptionRole;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
    public Role (){

    }

    public Role(int idRole, String descriptionRole, User user) {
        this.idRole = idRole;
        this.descriptionRole = descriptionRole;
        this.user = user;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getDescriptionRole() {
        return descriptionRole;
    }

    public void setDescriptionRole(String descriptionRole) {
        this.descriptionRole = descriptionRole;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
