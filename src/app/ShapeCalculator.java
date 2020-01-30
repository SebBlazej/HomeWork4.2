package app;

import model.Circle;
import model.Rectangle;
import model.Square;
import model.Triangle;

class ShapeCalculator {

    double squareArea(Square square){
        return square.getSideALenght()*square.getSideALenght();
    }

    double circleArea(Circle cirle){
        return cirle.getRadius()*cirle.getRadius()*3.14;
    }

    double trianglePerimeter(Triangle triangle){
        return triangle.getSideALenght() + triangle.getSideBLenght() + triangle.getSideCLenght();
    }

    double rectPerimeter(Rectangle rectangle){
        return rectangle.getSideALenght()*2+rectangle.getSideBLenght()*2;
    }
}
