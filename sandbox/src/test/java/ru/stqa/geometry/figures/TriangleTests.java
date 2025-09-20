package ru.stqa.geometry.figures;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void callCalculateArea(){
        var s = new Triangle(2.0, 3.0, 4.0);
        double result = s.area();
        double delta = 0.1;
        Assertions.assertEquals(2.9, result, delta);
    }

    @Test
    void callCalculatePerimeter() {
        Assertions.assertEquals(9.0, new Triangle(2.0, 3.0, 4.0).perimeter());
    }

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-2.0, 3.0, 4.0);
        } catch (IllegalArgumentException exception) {
            System.out.println("Exception worked");
        }
    }

    @Test
    void testEquality() {
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(4.0 ,5.0, 3.0);
        Assertions.assertEquals(t1, t2);
    }
}
