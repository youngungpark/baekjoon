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

        String[] str = br.readLine().split("-");
        int result = 0;

        for (int i = 0; i < str.length; i++) {
            int temp = sum(str[i]);
            if (i == 0)
                result += temp;
            else
                result -= temp;

        }

        System.out.println(result);
    }

    public static int sum(String str) {
        int result = 0;
        String[] temp = str.split("[+]");
        for (int i = 0; i < temp.length; i++) {
            result += Integer.parseInt(temp[i]);
        }
        return result;
    }
}