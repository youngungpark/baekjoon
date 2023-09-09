import java.io.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = 0;

        for(int i = 1 ; i <= N ; i++) {

            int number = i;
            int temp = 0;

            while(number != 0) {
                temp += number % 10;
                number /= 10;
            }

            if(temp + i == N) {
                M = i;
                break;
            }
        }

        bw.write(String.valueOf(M));

        br.close();
        bw.flush();
        bw.close();
    }
}