import java.math.BigInteger;

public class Factorial {

    public static long factorialLong(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            return 1;
        }

        return n * factorialLong(n - 1);
    }

    public static BigInteger factorialBigInteger(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(n)
                .multiply(factorialBigInteger(n - 1));
    }
}