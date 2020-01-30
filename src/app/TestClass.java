package app;

import model.Circle;
import model.Rectangle;
import model.Square;
import model.Triangle;

public class TestClass {
    public static void main(String[] args){
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Square square = new Square(10.5);
        Circle circle = new Circle(5.5);
        Triangle triangle = new Triangle(10,5,2.5);
        Rectangle rectangle = new Rectangle(10, 5.5);

        System.out.println("Pole kwadratu - " + shapeCalculator.squareArea(square));
        System.out.println("Pole koła - " + shapeCalculator.circleArea(circle));
        System.out.println("Obwód trójkąta - " + shapeCalculator.trianglePerimeter(triangle));
        System.out.println("Obwód prostokąta - " + shapeCalculator.rectPerimeter(rectangle));

    }
}
