package pe.edu.upc.qalikay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.qalikay.entities.OptionPay;

@Repository
public interface IOptionPayRepository extends JpaRepository<OptionPay, Integer> {
}
