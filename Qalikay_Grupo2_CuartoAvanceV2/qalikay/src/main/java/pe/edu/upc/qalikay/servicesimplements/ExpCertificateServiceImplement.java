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
    private IExpCertificateRepository eR;
    @Override
    public void insert(ExpCertificate expCertificate) {
        eR.save(expCertificate);
    }

    @Override
    public List<ExpCertificate> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public ExpCertificate listId(int id) {
        return eR.findById(id).orElse(new ExpCertificate());
    }

    @Override
    public List<String[]> quantityUserbyInstitutionName() {
        return eR.quantityUserbyInstitutionName();
    }
}
