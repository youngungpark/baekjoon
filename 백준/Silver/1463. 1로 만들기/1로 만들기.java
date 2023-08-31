
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[] dp = new int[count+1];

        dp[0] = 0;
        dp[1] = 0;


        for(int i=2; i<=count; i++){
            dp[i] = dp[i-1]+1;
            if(i%2 == 0){
                dp[i] = Math.min(dp[i],dp[i/2]+1);
            }
            
            if(i%3 == 0){
                dp[i] = Math.min(dp[i],dp[i/3]+1);
            }

        }

        System.out.print(dp[count]);



    }
};