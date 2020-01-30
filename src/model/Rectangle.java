package model;

public class Rectangle {
    private final double sideALenght;
    private final double sideBLenght;


    public Rectangle(double sideALenght, double sideBLenght){
        this.sideALenght = sideALenght;
        this.sideBLenght = sideBLenght;
    }

    public double getSideALenght() {
        return sideALenght;
    }

    public double getSideBLenght() {
        return sideBLenght;
    }
}
