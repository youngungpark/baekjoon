import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] isSelf = new boolean[1000000];
        for (int i = 1; i < 10001; i++) {
            int temp = findConstructorNumber(i);
            isSelf[temp] = true;
        }
        for (int i = 1; i < 10001; i++) {
            if (!isSelf[i]) {
                System.out.println(i);
            }
        }
    }

    public static int findConstructorNumber(int i) {
        int result = i;
        while (i > 0) {
            result += i % 10;
            i = i / 10;
        }
        return result;
    }
}