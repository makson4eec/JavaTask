import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String queen = sc.next().toLowerCase();
        String target = sc.next().toLowerCase();

        int x1 = queen.charAt(0) - 'a' + 1;
        int y1 = queen.charAt(1) - '0';
        int x2 = target.charAt(0) - 'a' + 1;
        int y2 = target.charAt(1) - '0';

        System.out.println((x1 + y1) % 2 == 0 ? "черная" : "белая");
        System.out.println((x2 + y2) % 2 == 0 ? "черная" : "белая");
        System.out.println(x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2) ? "Да" : "Нет");

        int count = 0;
        for (int x = 1; x <= 8; x++) {
            for (int y = 1; y <= 8; y++) {
                if ((x != x1 || y != y1) &&
                    (x == x1 || y == y1 || Math.abs(x - x1) == Math.abs(y - y1))) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
