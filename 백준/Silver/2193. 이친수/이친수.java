
import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        long result = 0;
        long[][] dp = new long[91][2];

        dp[1][1] = 1;
        dp[2][0] = 1;
        dp[3][0] = 1;
        dp[3][1] = 1;

        for(int i=4; i<count+1; i++){
            dp[i][0] = dp[i-1][0] + dp[i-1][1];
            dp[i][1] = dp[i-1][0];
        }

        System.out.println(dp[count][0]+dp[count][1]);





    }







};
