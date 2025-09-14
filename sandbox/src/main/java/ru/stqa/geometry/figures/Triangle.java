package ru.stqa.geometry.figures;

public class Triangle {
    public static void printTriangleArea(double a, double b, double c) {
        String text = String.format("Triangle with sides %f %f %f = %f", a, b, c, triangleArea(a, b, c));
        System.out.println(text);
    }

    public static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}