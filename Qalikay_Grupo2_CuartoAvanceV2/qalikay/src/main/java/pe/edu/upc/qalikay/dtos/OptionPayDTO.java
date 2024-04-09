package pe.edu.upc.qalikay.dtos;

import java.time.LocalDate;

public class OptionPayDTO {

    private int idOptionPay;


    private String typeOptionPay;


    private double amountOptionPay;


    private LocalDate optionPayDate;


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

    public double getAmountOptionPay() {
        return amountOptionPay;
    }

    public void setAmountOptionPay(double amountOptionPay) {
        this.amountOptionPay = amountOptionPay;
    }

    public LocalDate getOptionPayDate() {
        return optionPayDate;
    }

    public void setOptionPayDate(LocalDate optionPayDate) {
        this.optionPayDate = optionPayDate;
    }

    public String getDescriptionOptionPay() {
        return descriptionOptionPay;
    }

    public void setDescriptionOptionPay(String descriptionOptionPay) {
        this.descriptionOptionPay = descriptionOptionPay;
    }
}
