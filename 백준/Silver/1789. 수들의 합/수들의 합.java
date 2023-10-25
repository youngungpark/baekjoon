import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long input = Long.parseLong(br.readLine());

        long result = 0;
        long count = 0;
        while (result <= input) {
            count++;
            result += count;
        }
        System.out.println(count - 1);
    }
}