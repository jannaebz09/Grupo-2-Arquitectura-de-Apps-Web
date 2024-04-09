package pe.edu.upc.qalikay.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.qalikay.entities.User_Role;
import pe.edu.upc.qalikay.repositories.IUser_RoleRepository;
import pe.edu.upc.qalikay.servicesinterfaces.IUser_RoleService;

import java.util.List;
@Service
public class User_RoleServiceImplement implements IUser_RoleService {
    @Autowired
    private IUser_RoleRepository sR;
    @Override
    public void insert(User_Role user_role) {
        sR.save(user_role);
    }

    @Override
    public List<User_Role> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public User_Role listId(int id) {
        return sR.findById(id).orElse(new User_Role());
    }
}
