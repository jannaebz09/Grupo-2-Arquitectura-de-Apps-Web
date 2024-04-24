package pe.edu.upc.qalikay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.qalikay.entities.OptionPay;

import java.util.List;

@Repository
public interface IOptionPayRepository extends JpaRepository<OptionPay, Integer> {
    @Query(value = "select * from option_pay u where u.type_option_pay = 'Tarjeta'", nativeQuery = true)
    public List<OptionPay> listaxtarjeta();
}
