public class FirstTask {

    public static int power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException();
        }

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }
}