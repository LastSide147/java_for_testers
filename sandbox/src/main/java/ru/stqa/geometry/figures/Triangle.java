package ru.stqa.geometry.figures;


public class Triangle {

    private double a, b, c;

    public Triangle( double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void printTrianglePerimeter(Triangle p) {
        String textPerimeter = String.format("Triangle with sides %f %f %f = %f", p.a, p.b, p.c, p.perimeter());
        System.out.println(textPerimeter);
    }

    public static void printTriangleArea(Triangle s) {
        String textArea = String.format("Triangle with sides %f %f %f = %f", s.a, s.b, s.c, s.area());
        System.out.println(textArea);
    }

    public double area() {
        double halfPerimeter = (this.a + this.b + this.c) / 2;
        double s = Math.sqrt(halfPerimeter * (halfPerimeter - this.a) * (halfPerimeter - this.b) * (halfPerimeter - this.c));
        return s;
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }
}