package pe.edu.upc.qalikay.dtos;

import pe.edu.upc.qalikay.entities.Product;

public class DetailSaleWithoutSubtotalDTO {
    private int idDetailSale;
    private String descriptionDetailSale;
    private SaleDTO sale;
    private int quantity;
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

    public SaleDTO getSale() {
        return sale;
    }

    public void setSale(SaleDTO sale) {
        this.sale = sale;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
