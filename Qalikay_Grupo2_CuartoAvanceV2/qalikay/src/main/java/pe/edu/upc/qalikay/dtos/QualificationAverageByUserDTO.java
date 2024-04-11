package pe.edu.upc.qalikay.dtos;

public class QualificationAverageByUserDTO {
    private String fullName;
    private double average;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
