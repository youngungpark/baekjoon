import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result = Integer.MIN_VALUE;
        int[] sum = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = k; i < n + 1; i++) {
            result = Math.max(result, (sum[i] - sum[i - k]));

        }
        System.out.println(result);

    }

}