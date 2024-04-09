package pe.edu.upc.qalikay.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.qalikay.entities.User;
import pe.edu.upc.qalikay.repositories.IUserRepository;
import pe.edu.upc.qalikay.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {
    @Autowired
    private IUserRepository sR;

    @Override
    public void insert(User user){
        sR.save(user);}
    @Override
    public List<User> list(){
        return sR.findAll();}

    @Override
    public void delete(int id) {
        sR.deleteById(id);

    }

    @Override
    public User listId(int id) {
        return sR.findById(id).orElse(new User());
    }
}
