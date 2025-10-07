package ru.stqa.geometry;

import geometry.figures.Rectangle;
import geometry.figures.Square;
import geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(new Square(7.0));
        Square.printSquareArea(new Square(5.0));
        Square.printSquareArea(new Square(3.0));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(14, 12);

        Triangle.printTriangleArea(new Triangle(2.0, 3.0, 4.0));
        Triangle.printTrianglePerimeter(new Triangle(2.0, 3.0, 4.0));
    }
}
