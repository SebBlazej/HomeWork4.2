package model;

public class Triangle {
    private final double sideALenght;
    private final double sideBLenght;
    private final double sideCLenght;

    public Triangle(double sideALenght, double sideBLenght, double sideCLenght) {
        this.sideALenght = sideALenght;
        this.sideBLenght = sideBLenght;
        this.sideCLenght = sideCLenght;
    }

    public double getSideALenght() {
        return sideALenght;
    }

    public double getSideBLenght() {
        return sideBLenght;
    }

    public double getSideCLenght() {
        return sideCLenght;
    }
}
