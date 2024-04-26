package pe.edu.upc.qalikay.entities;


import jakarta.persistence.*;


@Entity
@Table (name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    @Column(name = "nameProduct", nullable = false, length = 50)
    private String nameProduct;
    @Column(name = "descriptionProduct", nullable = false, length = 50)
    private String descriptionProduct;
    @Column(name = "preparationProduct", nullable = false, length = 50)
    private String preparationProduct;

    @Column(name = "amountProduct", nullable = false)
    private double amountProduct;

    @Column(name = "rucProduct", nullable = false, length = 50)
    private int rucProduct;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String descriptionProduct, String preparationProduct, double amountProduct, int rucProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.preparationProduct = preparationProduct;
        this.amountProduct = amountProduct;
        this.rucProduct = rucProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public String getPreparationProduct() {
        return preparationProduct;
    }

    public void setPreparationProduct(String preparationProduct) {
        this.preparationProduct = preparationProduct;
    }

    public double getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(double amountProduct) {
        this.amountProduct = amountProduct;
    }

    public int getRucProduct() {
        return rucProduct;
    }

    public void setRucProduct(int rucProduct) {
        this.rucProduct = rucProduct;
    }
}




