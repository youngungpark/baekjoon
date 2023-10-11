import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] countArr = new int[3];
        boolean isTrue = true;

        if (N % 10 != 0) {
            isTrue = false;
        } else {
            countArr[0] = N / 300;
            N %= 300;

            countArr[1] = N / 60;
            N %= 60;

            countArr[2] = N / 10;
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
