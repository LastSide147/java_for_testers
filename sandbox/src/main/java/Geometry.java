public class Geometry {
    public static void main(String[] args) {
        printSquareArea(7);
        printSquareArea(5.0);
        printSquareArea(4);

        printRectangleArea(3.0, 5.0);
        printRectangleArea(14, 12);
    }

    private static void printRectangleArea(double a, double b) {
        System.out.println("Square rectangle with sides " + a + " and " + b + " = " + rectangleArea(a, b));
    }

    private static double rectangleArea(double a, double b) {
        return a * b;
    }

    static void printSquareArea(double a) {
        System.out.println("Square area with side " + a + " = " + squareArea(a));
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
