package ru.stqa.geometry.figures;


public record Triangle(double a, double b, double c) {

//    private double a, b, c;

//    public Triangle( double a, double b, double c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

    public Triangle {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }
        if( (a + b) < c || (a + c) < b || (c + b) < a ) {
            throw new IllegalArgumentException("Sum two triangle side don't less third side");
        }
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