package pe.edu.upc.qalikay.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "OptionPay")
public class OptionPay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOptionPay;

    @Column(name = "typeOptionPay", nullable = false, length = 50)
    private String typeOptionPay;

    @Column(name="amountOptionPay", nullable = false )
    private double amountOptionPay;

    @Column(name="optipnPayDate", nullable = false)
    private LocalDate optionPayDate;

    @Column(name = "descriptionOptionPay", nullable = false, length = 50)
    private String descriptionOptionPay;

    public OptionPay(){

    }

    public OptionPay(int idOptionPay, String typeOptionPay, double amountOptionPay, LocalDate optionPayDate, String descriptionOptionPay) {
        this.idOptionPay = idOptionPay;
        this.typeOptionPay = typeOptionPay;
        this.amountOptionPay = amountOptionPay;
        this.optionPayDate = optionPayDate;
        this.descriptionOptionPay = descriptionOptionPay;
    }

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
