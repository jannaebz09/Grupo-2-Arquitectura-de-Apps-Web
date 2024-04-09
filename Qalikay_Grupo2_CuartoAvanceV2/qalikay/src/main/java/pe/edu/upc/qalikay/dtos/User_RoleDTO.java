package pe.edu.upc.qalikay.dtos;

import pe.edu.upc.qalikay.entities.Role;
import pe.edu.upc.qalikay.entities.User;

public class User_RoleDTO {
    private int idUser_Role;
    private User user;
    private Role role;

    public int getIdUser_Role() {
        return idUser_Role;
    }

    public void setIdUser_Role(int idUser_Role) {
        this.idUser_Role = idUser_Role;
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
