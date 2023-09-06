import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        long[] dp = new long[count+1];


        dp[0] = 0;
        dp[1] = 0;

        for(int i=2; i<count+1; i++){
            dp[i] = dp[i-1]+1;

            if(i%2==0){
                dp[i] = Math.min(dp[i/2]+1,dp[i]);
            }
            if(i%3==0){
                dp[i] = Math.min(dp[i/3]+1,dp[i]);
            }
        }

        System.out.println(dp[count]);










    }







};
