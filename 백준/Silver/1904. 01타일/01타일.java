import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        long[][] dp = new long[1000001][2];

        dp[1][1] = 1;
        dp[2][1] = 1;
        dp[2][0] = 1;

        for(int i=3; i<count+1; i++){
            dp[i][1] = (dp[i-1][1] + dp[i-1][0])%15746;
            dp[i][0] = (dp[i-2][0] + dp[i-2][1])%15746;
        }

        long result = 0;

        result = (dp[count][0] + dp[count][1])%15746;

        bw.write(result%15746+"");



        bw.flush();







    }







};
