import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void factorialZero() {
        assertEquals(1, Factorial.factorialLong(0));
        assertEquals(BigInteger.ONE, Factorial.factorialBigInteger(0));
    }

    @Test
    void factorialRecursiveCases() {
        assertEquals(1, Factorial.factorialLong(1));
        assertEquals(120, Factorial.factorialLong(5));
        assertEquals(3628800, Factorial.factorialLong(10));

        assertEquals(
                BigInteger.valueOf(120),
                Factorial.factorialBigInteger(5)
        );
    }

    @Test
    void negativeNumberThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Factorial.factorialLong(-1)
        );

        assertThrows(
                IllegalArgumentException.class,
                () -> Factorial.factorialBigInteger(-1)
        );
    }

    @Test
    void longOverflowStartsAt21() {
        BigInteger correct = Factorial.factorialBigInteger(21);

        BigInteger longResult =
                BigInteger.valueOf(Factorial.factorialLong(21));

        assertNotEquals(correct, longResult);
    }
}