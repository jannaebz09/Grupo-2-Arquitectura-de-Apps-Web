package pe.edu.upc.qalikay.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "User_Role")
public class User_Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser_Role;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
    @ManyToOne
    @JoinColumn(name = "idRole")
    private Role role;

    public User_Role() {
    }

    public User_Role(int idUser_Role, User user, Role role) {
        this.idUser_Role = idUser_Role;
        this.user = user;
        this.role = role;
    }

    public int getIdUser_Role() {
        return idUser_Role;
    }

    public void setIdUser_Role(int idPaco) {
        this.idUser_Role = idPaco;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
