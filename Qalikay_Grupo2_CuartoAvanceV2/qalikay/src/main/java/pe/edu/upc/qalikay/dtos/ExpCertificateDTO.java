package pe.edu.upc.qalikay.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.qalikay.entities.User;

public class ExpCertificateDTO {
    private int idExpCertificate;
    private int uniqueCodeCertificate;
    private String institutionName;
    private String certificateTitle;
    private UserWithoutPasswordDTO user;

    public int getIdExpCertificate() {
        return idExpCertificate;
    }

    public void setIdExpCertificate(int idExpCertificate) {
        this.idExpCertificate = idExpCertificate;
    }

    public int getUniqueCodeCertificate() {
        return uniqueCodeCertificate;
    }

    public void setUniqueCodeCertificate(int uniqueCodeCertificate) {
        this.uniqueCodeCertificate = uniqueCodeCertificate;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getCertificateTitle() {
        return certificateTitle;
    }

    public void setCertificateTitle(String certificateTitle) {
        this.certificateTitle = certificateTitle;
    }

    public UserWithoutPasswordDTO getUser() {
        return user;
    }

    public void setUser(UserWithoutPasswordDTO user) {
        this.user = user;
    }
}
