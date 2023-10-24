import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = 0;
        int C = 0;
        T = Integer.parseInt(br.readLine());
        int[] money = { 25, 10, 5, 1 };
        for (int i = 0; i < T; i++) {
            C = Integer.parseInt(br.readLine());
            int[] result = new int[4];
            for (int j = 0; j < money.length; j++) {
                result[j] = C / money[j];
                C = C % money[j];
                bw.write(result[j] + " ");
            }
            bw.write("\n");
        }
        bw.flush();
    }
}