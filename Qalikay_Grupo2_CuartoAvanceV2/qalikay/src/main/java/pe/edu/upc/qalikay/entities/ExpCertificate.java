package pe.edu.upc.qalikay.entities;

import jakarta.persistence.*;

@Entity
@Table(name="ExpCertificate")
public class ExpCertificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExpCertificate;
    @Column(name="uniqueCodeCertificate",nullable = false)
    private int uniqueCodeCertificate;
    @Column(name = "intitutionName",nullable = false,length = 50)
    private String institutionName;
    @Column(name = "certificateTitle",nullable = false,length = 25)
    private String certificateTitle;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;

    public ExpCertificate() {
    }

    public ExpCertificate(int idExpCertificate, int uniqueCodeCertificate, String institutionName, String certificateTitle, User user) {
        this.idExpCertificate = idExpCertificate;
        this.uniqueCodeCertificate = uniqueCodeCertificate;
        this.institutionName = institutionName;
        this.certificateTitle = certificateTitle;
        this.user = user;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
