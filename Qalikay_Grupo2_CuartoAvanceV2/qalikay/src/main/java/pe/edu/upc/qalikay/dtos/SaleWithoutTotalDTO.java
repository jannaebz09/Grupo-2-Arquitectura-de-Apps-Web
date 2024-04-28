package pe.edu.upc.qalikay.dtos;

import pe.edu.upc.qalikay.entities.OptionPay;

import java.time.LocalDate;

public class SaleWithoutTotalDTO {
    private int idSale;
    private LocalDate saleDate;

    private UserWithoutPasswordDTO user;
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

    public UserWithoutPasswordDTO getUser() {
        return user;
    }

    public void setUser(UserWithoutPasswordDTO user) {
        this.user = user;
    }

    public OptionPay getOptionPay() {
        return optionPay;
    }

    public void setOptionPay(OptionPay optionPay) {
        this.optionPay = optionPay;
    }
}
