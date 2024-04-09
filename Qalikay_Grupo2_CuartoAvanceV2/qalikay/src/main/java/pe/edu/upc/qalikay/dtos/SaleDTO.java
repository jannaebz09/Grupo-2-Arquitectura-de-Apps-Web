package pe.edu.upc.qalikay.dtos;
import jakarta.persistence.*;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.qalikay.entities.OptionPay;
import pe.edu.upc.qalikay.entities.User;

import java.time.LocalDate;

public class SaleDTO {
    private int idSale;
    private LocalDate saleDate;
    private int amount;
    private User user;
    private OptionPay optionPay;

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OptionPay getOptionPay() {
        return optionPay;
    }

    public void setOptionPay(OptionPay optionPay) {
        this.optionPay = optionPay;
    }
}
