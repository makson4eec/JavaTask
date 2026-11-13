import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> a = new TreeSet<>();
        Set<String> b = new TreeSet<>();

        for (String s : sc.nextLine().replaceAll("[\\[\\],]", " ").trim().split("\\s+")) {
            if (!s.isEmpty()) a.add(s);
        }
        for (String s : sc.nextLine().replaceAll("[\\[\\],]", " ").trim().split("\\s+")) {
            if (!s.isEmpty()) b.add(s);
        }

        Set<String> result = new TreeSet<>(a);
        result.addAll(b);
        Set<String> common = new HashSet<>(a);
        common.retainAll(b);
        result.removeAll(common);

        System.out.println(result);
    }
}
