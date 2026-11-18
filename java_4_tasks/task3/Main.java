import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());
        int[] a = new int[n];
        if (n > 0) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
        }

        long comparisons = 0;
        long shifts = 0;
        long insertions = 0;

        for (int i = 1; i < n; i++) {
            int value = a[i];
            int j = i - 1;
            insertions++;
            while (j >= 0) {
                comparisons++;
                if (a[j] <= value) {
                    break;
                }
                a[j + 1] = a[j];
                shifts++;
                j--;
            }
            a[j + 1] = value;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                result.append(' ');
            }
            result.append(a[i]);
        }
        result.append('\n');
        result.append(comparisons).append(' ').append(shifts).append(' ').append(insertions);
        System.out.println(result);
    }
}
