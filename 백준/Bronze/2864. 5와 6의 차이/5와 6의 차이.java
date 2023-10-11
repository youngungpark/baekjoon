import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String temp1 = st.nextToken();
        String temp2 = st.nextToken();
        temp1 = temp1.replace('6', '5');
        temp2 = temp2.replace('6', '5');
        int num1 = Integer.parseInt(temp1) + Integer.parseInt(temp2);
        temp1 = temp1.replace('5', '6');
        temp2 = temp2.replace('5', '6');
        int num2 = Integer.parseInt(temp1) + Integer.parseInt(temp2);
        System.out.println(num1 + " " + num2);
    }
}