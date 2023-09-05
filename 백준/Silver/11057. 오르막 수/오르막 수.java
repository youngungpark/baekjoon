
import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        long result = 0;
        long [][] dp = new long[1001][10];



        for(int i=0; i<10; i++){
            dp[1][i] = 1;
        }

        for(int i=2; i<count+1; i++){
            for(int j=0; j<10; j++ ){
                for(int k=j; k<10; k++ ){
                    dp[i][j] += dp[i-1][k];

                    dp[i][j] %= 10007;

                }

            }
        }

        for(int i=0; i<10; i++){
            result += (dp[count][i])%10007;
        }
        bw.write(result%10007+"");
        bw.flush();





    }







};
