package pe.edu.upc.qalikay.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "DetailSale")
public class DetailSale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idDetailSale;
    @Column(name = "descriptionDetailSale", nullable = false, length = 75)
    private String descriptionDetailSale;

    @Column(name = "subtotal", nullable = false)
    private double subtotal;
    @Column(name = "quantity", nullable = false)
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "idSale")
    private Sale sale;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Product product;

    public DetailSale(){

    }

    public DetailSale(int idDetailSale, String descriptionDetailSale, double subtotal, int quantity, Sale sale, Product product) {
        this.idDetailSale = idDetailSale;
        this.descriptionDetailSale = descriptionDetailSale;
        this.subtotal = subtotal;
        this.quantity = quantity;
        this.sale = sale;
        this.product = product;
    }

    public int getIdDetailSale() {
        return idDetailSale;
    }

    public void setIdDetailSale(int idDetailSale) {
        this.idDetailSale = idDetailSale;
    }

    public String getDescriptionDetailSale() {
        return descriptionDetailSale;
    }

    public void setDescriptionDetailSale(String descriptionDetailSale) {
        this.descriptionDetailSale = descriptionDetailSale;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
