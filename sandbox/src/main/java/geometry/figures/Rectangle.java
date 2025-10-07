package geometry.figures;

import java.util.Objects;

public record Rectangle(double a, double b) {

//    private double a, b;
//
//    public Rectangle(double a, double b) {
//        this.a = a;
//        this.b = b;
//    }

    public Rectangle {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Rectangle side should be non-negative");
        }
    }

    public static void printRectangleArea(double a, double b) {
        var text = String.format("Square rectangle with sides %f and %f = %f", a, b, rectangleArea(a, b) );
        System.out.println(text);
    }

    private static double rectangleArea(double a, double b) {
        return a * b;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.a, this.a) == 0 && Double.compare(rectangle.b, this.b) == 0
                || Double.compare(rectangle.a, this.b) == 0 && Double.compare(rectangle.b, this.a) == 0;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
