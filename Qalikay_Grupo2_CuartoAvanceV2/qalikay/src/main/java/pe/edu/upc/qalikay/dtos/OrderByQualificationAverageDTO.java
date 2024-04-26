package pe.edu.upc.qalikay.dtos;

public class OrderByQualificationAverageDTO {
    private int idSp_Recipe;
    private String description;
    private double average;

    public int getIdSp_Recipe() {
        return idSp_Recipe;
    }

    public void setIdSp_Recipe(int idSp_Recipe) {
        this.idSp_Recipe = idSp_Recipe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
