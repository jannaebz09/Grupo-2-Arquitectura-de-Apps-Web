package pe.edu.upc.qalikay.dtos;

public class UserDTO {
    private int idUser;
    private String userName;
    private String fullName;
    private String email;
    private String password;
    private String symptoms;
    private String verificationExpert;
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
