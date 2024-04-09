package pe.edu.upc.qalikay.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    @Column(name = "descriptionRole", nullable = false, length = 50)
    private String descriptionRole;

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
