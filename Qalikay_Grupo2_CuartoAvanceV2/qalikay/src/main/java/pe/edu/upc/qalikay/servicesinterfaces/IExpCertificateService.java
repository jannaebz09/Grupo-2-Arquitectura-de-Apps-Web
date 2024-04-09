package pe.edu.upc.qalikay.servicesinterfaces;

import pe.edu.upc.qalikay.entities.Comment;
import pe.edu.upc.qalikay.entities.ExpCertificate;

import java.util.List;

public interface IExpCertificateService {
    public void insert(ExpCertificate expCertificate);
    public List<ExpCertificate> list();

    public void delete(int id);
    public ExpCertificate listId(int id);
}
