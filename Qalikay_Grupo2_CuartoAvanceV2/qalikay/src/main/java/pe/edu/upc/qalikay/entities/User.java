package pe.edu.upc.qalikay.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "UserT")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "userName", nullable = false, length = 50)
    private String userName;
    @Column(name = "fullName", nullable = false, length = 50)
    private String fullName;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Column(name = "password", nullable = false, length = 50)
    private String password;
    @Column(name = "symptoms", nullable = false, length = 200)
    private String symptoms;
    @Column(name = "verficationExpert", nullable = false)
    private String verificationExpert;
    @Column(name = "dni", nullable = false)
    private int dni;

    public User() {
    }

    public User(int idUser, String userName, String fullName, String email, String password, String symptoms, String verificationExpert, int dni) {
        this.idUser = idUser;
        this.userName = userName;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.symptoms = symptoms;
        this.verificationExpert = verificationExpert;
        this.dni = dni;
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

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String isVerificationExpert() {
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
}

