package pe.edu.upc.qalikay.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.qalikay.entities.Product;
import pe.edu.upc.qalikay.entities.Role;
import pe.edu.upc.qalikay.repositories.IRoleRepository;
import pe.edu.upc.qalikay.servicesinterfaces.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplement implements IRoleService {

    @Autowired
    private IRoleRepository sR;


    @Override
    public void insert(Role role) {
        sR.save(role);
    }

    @Override
    public List<Role> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);

    }

    @Override
    public Role listId(int id) {
        return sR.findById(id).orElse(new Role());
    }
}
