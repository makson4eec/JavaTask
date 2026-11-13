import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String square = sc.next().toLowerCase();
        int x1 = square.charAt(0) - 'a' + 1;
        int y1 = square.charAt(1) - '0';

        List<String> moves = new ArrayList<>();
        for (int x = 1; x <= 8; x++) {
            for (int y = 1; y <= 8; y++) {
                if ((x != x1 || y != y1) &&
                    (x == x1 || y == y1 || Math.abs(x - x1) == Math.abs(y - y1))) {
                    moves.add("" + (char) ('a' + x - 1) + y);
                }
            }
        }

        System.out.println(moves.size());
        System.out.println(String.join(" ", moves));
    }
}
