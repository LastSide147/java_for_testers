package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(7);
        Square.printSquareArea(5.0);
        Square.printSquareArea(4);

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(14, 12);

        Triangle.printTriangleArea(2.0, 3.0, 4.0);
    }
}
