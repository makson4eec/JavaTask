import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        if (n > 0) {
            st = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < q; i++) {
            int x = Integer.parseInt(reader.readLine().trim());
            int left = 0;
            int right = n;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (a[mid] < x) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            result.append(left).append('\n');
        }
        System.out.print(result);
    }
}
