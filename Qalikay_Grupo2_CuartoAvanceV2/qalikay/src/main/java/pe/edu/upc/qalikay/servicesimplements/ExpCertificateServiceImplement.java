package pe.edu.upc.qalikay.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.qalikay.entities.ExpCertificate;
import pe.edu.upc.qalikay.repositories.IExpCertificateRepository;
import pe.edu.upc.qalikay.servicesinterfaces.IExpCertificateService;

import java.util.List;
@Service
public class ExpCertificateServiceImplement implements IExpCertificateService {
    @Autowired
    private IExpCertificateRepository sR;
    @Override
    public void insert(ExpCertificate expCertificate) {
        sR.save(expCertificate);
    }

    @Override
    public List<ExpCertificate> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public ExpCertificate listId(int id) {
        return sR.findById(id).orElse(new ExpCertificate());
    }

    @Override
    public List<String[]> quantityUserbyInstitutionName() {
        return sR.quantityUserbyInstitutionName();
    }
}
