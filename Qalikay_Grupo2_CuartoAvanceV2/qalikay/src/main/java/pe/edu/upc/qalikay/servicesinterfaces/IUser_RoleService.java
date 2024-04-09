package pe.edu.upc.qalikay.servicesinterfaces;

import pe.edu.upc.qalikay.entities.User_Role;

import java.util.List;

public interface IUser_RoleService {
    public void insert(User_Role user_role);
    public List<User_Role> list();

    public void delete(int id);
    public User_Role listId(int id);
}
