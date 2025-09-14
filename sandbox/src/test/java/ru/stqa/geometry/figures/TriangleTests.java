package ru.stqa.geometry.figures;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    void callCalculateArea(){
        double result = Triangle.triangleArea(2.0, 3.0, 4.0);
        double delta = 0.1;
        Assertions.assertEquals(2.9, result, delta);
    }
}
