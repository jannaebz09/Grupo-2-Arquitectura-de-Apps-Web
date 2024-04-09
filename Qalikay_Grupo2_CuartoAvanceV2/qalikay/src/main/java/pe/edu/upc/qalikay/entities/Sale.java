package pe.edu.upc.qalikay.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Sale")
public class Sale{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSale;
    @Column(name="saleDate", nullable = false, length = 10)
    private LocalDate saleDate;
    @Column(name="amount", nullable = false)
    private int amount;
    @ManyToOne
    @JoinColumn(name = "idUser")
    private User user;
    @ManyToOne
    @JoinColumn(name="idOptionPay")
    private OptionPay optionPay;

    public Sale() {
    }

    public Sale(int idSale, LocalDate saleDate, int amount, User user, OptionPay optionPay) {
        this.idSale = idSale;
        this.saleDate = saleDate;
        this.amount = amount;
        this.user = user;
        this.optionPay = optionPay;
    }

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
