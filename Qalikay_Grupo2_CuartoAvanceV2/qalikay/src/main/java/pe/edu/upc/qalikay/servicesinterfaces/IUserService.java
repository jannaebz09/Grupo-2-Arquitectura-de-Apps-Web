package pe.edu.upc.qalikay.servicesinterfaces;

import pe.edu.upc.qalikay.entities.User;

import java.util.List;

public interface IUserService {
    public void insert(User user);
    public List<User> list();
    public void delete(int id);
    public User listId(int id);
}
