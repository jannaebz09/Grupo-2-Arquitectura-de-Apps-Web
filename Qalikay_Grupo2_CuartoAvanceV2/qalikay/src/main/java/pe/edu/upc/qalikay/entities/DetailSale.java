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

    @ManyToOne
    @JoinColumn(name = "idSale")
    private Sale sale;

    @ManyToOne
    @JoinColumn(name = "idProducto")
    private Product product;

    public DetailSale(){

    }

    public DetailSale(int idDetailSale, String descriptionDetailSale, Sale sale, Product product) {
        this.idDetailSale = idDetailSale;
        this.descriptionDetailSale = descriptionDetailSale;
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
