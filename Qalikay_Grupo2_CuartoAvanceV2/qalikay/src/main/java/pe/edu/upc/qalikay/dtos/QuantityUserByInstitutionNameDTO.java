package pe.edu.upc.qalikay.dtos;

public class QuantityUserByInstitutionNameDTO {
    private String intitutionName;
    private int quantity;

    public String getIntitutionName() {
        return intitutionName;
    }

    public void setIntitutionName(String intitutionName) {
        this.intitutionName = intitutionName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
