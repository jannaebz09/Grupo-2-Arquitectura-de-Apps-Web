package pe.edu.upc.qalikay.dtos;


import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.qalikay.entities.Product;
import pe.edu.upc.qalikay.entities.Sale;

public class DetailSaleDTO {

    private int idDetailSale;
    private String descriptionDetailSale;
    private double subtotal;
    private Sale sale;
    private Product product;

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

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
