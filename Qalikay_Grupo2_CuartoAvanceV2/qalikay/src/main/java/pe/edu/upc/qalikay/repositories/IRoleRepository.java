package pe.edu.upc.qalikay.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.qalikay.entities.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Integer> {
}
