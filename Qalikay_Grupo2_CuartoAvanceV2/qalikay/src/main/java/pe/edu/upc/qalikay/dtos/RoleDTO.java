package pe.edu.upc.qalikay.dtos;

public class RoleDTO {
    private int idRole;
    private String descriptionRole;
    private UserWithoutPasswordDTO user;

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

    public UserWithoutPasswordDTO getUser() {
        return user;
    }

    public void setUser(UserWithoutPasswordDTO user) {
        this.user = user;
    }
}
