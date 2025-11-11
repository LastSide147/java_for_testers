package ru.stqa.geometry;

import geometry.figures.Rectangle;
import geometry.figures.Square;
import geometry.figures.Triangle;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Geometry {
    public static void main(String[] args) {
        Supplier<Square> randomSquare = () -> new Square(new Random().nextDouble(100.0));
        var squares = Stream.generate(randomSquare).limit(5);

        squares.peek(Square::area).forEach(Square::perimeter);
    }
}
