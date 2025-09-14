package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(7);
        Square.printSquareArea(5.0);
        Square.printSquareArea(4);

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(14, 12);
    }

}
