
import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());


        int[] dp = new int[46];

        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for(int i=3; i<dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[count]);


        bw.flush();








    }







};
