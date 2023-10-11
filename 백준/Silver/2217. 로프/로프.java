import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] data = new Integer[N];
        for (int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(data, Collections.reverseOrder());
        int result = 0;
        for (int i = 0; i < N; i++) {
            result = Math.max(result, data[i] * (i + 1));
        }
        System.out.println(result);
    }
}