import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

public class MathTest {

    @Test
    void testDivideByZero() {
        var x = 1;
        var y = 0;
        var z = x / y;
        System.out.println(z);
    }
}
