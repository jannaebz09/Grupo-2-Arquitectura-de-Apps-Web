package pe.edu.upc.qalikay.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "UserT")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "userName", nullable = false, length = 50)
    private String userName;
    @Column(name = "fullName", nullable = false, length = 50)
    private String fullName;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Column(name = "password", nullable = false, length = 200)
    private String password;
    private Boolean enabled;
    @Column(name = "symptoms", nullable = false, length = 200)
    private String symptoms;
    @Column(name = "verficationExpert", nullable = false)
    private String verificationExpert;
    @Column(name = "dni", nullable = false)
    private int dni;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Role> roles;

    public User() {
    }

    public User(int idUser, String userName, String fullName, String email, String password, Boolean enabled, String symptoms, String verificationExpert, int dni, List<Role> roles) {
        this.idUser = idUser;
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.symptoms = symptoms;
        this.verificationExpert = verificationExpert;
        this.dni = dni;
        this.roles = roles;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getVerificationExpert() {
        return verificationExpert;
    }

    public void setVerificationExpert(String verificationExpert) {
        this.verificationExpert = verificationExpert;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}

