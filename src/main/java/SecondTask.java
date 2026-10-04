public class SecondTask {

    public static int sequence(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        if (n == 0) {
            return 2;
        }

        if (n == 1) {
            return 3;
        }

        return sequence(n - 1) + 2 * sequence(n - 2);
    }
}