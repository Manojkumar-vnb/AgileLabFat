package test.java.com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FibonacciTest {
    @Test
    public void testFibonacci() {
        assertEquals("0 1 1 2 3", Fibonacci.generateSeries(5));
    }
}
