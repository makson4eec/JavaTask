import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class SortedArray {
    private final ArrayList<Integer> values = new ArrayList<>();

    public SortedArray(int[] numbers) {
        for (int number : numbers) {
            values.add(number);
        }
        Collections.sort(values);
    }

    private int lowerBound(int x) {
        int left = 0;
        int right = values.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (values.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private int upperBound(int x) {
        int left = 0;
        int right = values.size();
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (values.get(mid) <= x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public void add(int x) {
        values.add(upperBound(x), x);
    }

    public boolean contains(int x) {
        int index = lowerBound(x);
        return index < values.size() && values.get(index) == x;
    }

    public void remove(int x) {
        int index = lowerBound(x);
        if (index < values.size() && values.get(index) == x) {
            values.remove(index);
        }
    }

    public int countRange(int left, int right) {
        if (left > right) {
            return 0;
        }
        return upperBound(right) - lowerBound(left);
    }

    public String print() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.size(); i++) {
            if (i > 0) {
                result.append(' ');
            }
            result.append(values.get(i));
        }
        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int[] numbers = new int[n];
        if (n > 0) {
            st = new StringTokenizer(reader.readLine());
            for (int i = 0; i < n; i++) {
                numbers[i] = Integer.parseInt(st.nextToken());
            }
        }

        SortedArray a = new SortedArray(numbers);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(reader.readLine());
            String command = st.nextToken();
            switch (command) {
                case "ADD":
                    a.add(Integer.parseInt(st.nextToken()));
                    break;
                case "CONTAINS":
                    result.append(a.contains(Integer.parseInt(st.nextToken())) ? "YES" : "NO").append('\n');
                    break;
                case "REMOVE":
                    a.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "COUNT_RANGE":
                    int left = Integer.parseInt(st.nextToken());
                    int right = Integer.parseInt(st.nextToken());
                    result.append(a.countRange(left, right)).append('\n');
                    break;
                case "PRINT":
                    result.append(a.print()).append('\n');
                    break;
            }
        }
        System.out.print(result);
    }
}
