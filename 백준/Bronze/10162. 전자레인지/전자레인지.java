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
        int[] countArr = new int[3];
        boolean isTrue = true;
        while (N > 0) {
            if (N % 300 == 0) {
                countArr[0] = N / 300;
                break;
            } else if (N % 60 == 0) {
                countArr[1] = N / 60;
                break;
            } else if (N >= 10) {
                N -= 10;
                countArr[2]++;
            } else {
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            for (int i : countArr) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println(-1);
        }
    }
}