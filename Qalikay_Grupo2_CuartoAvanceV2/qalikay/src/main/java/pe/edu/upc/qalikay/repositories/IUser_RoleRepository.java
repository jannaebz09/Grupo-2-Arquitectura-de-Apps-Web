package pe.edu.upc.qalikay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.qalikay.entities.User_Role;

@Repository
public interface IUser_RoleRepository extends JpaRepository<User_Role,Integer> {
}
