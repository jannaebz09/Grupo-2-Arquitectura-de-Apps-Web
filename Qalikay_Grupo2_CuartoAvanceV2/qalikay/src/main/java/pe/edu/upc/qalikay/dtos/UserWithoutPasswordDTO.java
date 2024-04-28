package pe.edu.upc.qalikay.dtos;

import jakarta.persistence.Column;

public class UserWithoutPasswordDTO {
    private int idUser;
    private String userName;
    private String fullName;
    private String email;
    private Boolean enabled;
    private String symptoms;
    private Boolean verificationExpert;
    private int dni;

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

    public Boolean getVerificationExpert() {
        return verificationExpert;
    }

    public void setVerificationExpert(Boolean verificationExpert) {
        this.verificationExpert = verificationExpert;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
