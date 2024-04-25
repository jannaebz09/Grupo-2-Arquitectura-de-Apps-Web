package pe.edu.upc.qalikay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.qalikay.entities.ExpCertificate;

import java.util.List;

@Repository
public interface IExpCertificateRepository extends JpaRepository<ExpCertificate,Integer> {
    @Query (value = "SELECT ec.institution_name, COUNT(*) as Cantidad \n" +
            "FROM exp_certificate ec inner join usert u \n" +
            "ON ec.id_user = u.id_user \n" +
            "GROUP BY ec.institution_name ",nativeQuery = true)
    public List <String[]> quantityUserbyInstitutionName();

}
