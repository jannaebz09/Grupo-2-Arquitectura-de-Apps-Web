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

    public Role(int idRole, String descriptionRole) {
        this.idRole = idRole;
        this.descriptionRole = descriptionRole;
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
}
