package pe.edu.upc.qalikay.dtos;

import java.time.LocalDate;

public class OptionPayDTO {

    private int idOptionPay;


    private String typeOptionPay;


    private String descriptionOptionPay;

    public int getIdOptionPay() {
        return idOptionPay;
    }

    public void setIdOptionPay(int idOptionPay) {
        this.idOptionPay = idOptionPay;
    }

    public String getTypeOptionPay() {
        return typeOptionPay;
    }

    public void setTypeOptionPay(String typeOptionPay) {
        this.typeOptionPay = typeOptionPay;
    }

    public String getDescriptionOptionPay() {
        return descriptionOptionPay;
    }

    public void setDescriptionOptionPay(String descriptionOptionPay) {
        this.descriptionOptionPay = descriptionOptionPay;
    }
}
