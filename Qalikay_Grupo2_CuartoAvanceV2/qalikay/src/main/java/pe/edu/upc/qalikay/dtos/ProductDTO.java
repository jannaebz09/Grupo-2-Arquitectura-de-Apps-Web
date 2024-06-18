package pe.edu.upc.qalikay.dtos;


public class ProductDTO {
    private int idProduct;
    private String nameProduct;
    private String descriptionProduct;
    private String preparationProduct;
    private int amountProduct;
    private Long rucProduct;

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

    public int getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(int amountProduct) {
        this.amountProduct = amountProduct;
    }

    public Long getRucProduct() {
        return rucProduct;
    }

    public void setRucProduct(Long rucProduct) {
        this.rucProduct = rucProduct;
    }
}
