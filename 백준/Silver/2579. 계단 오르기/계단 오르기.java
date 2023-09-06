import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        long[] dp = new long[301];
        long[] dt = new long[301];

        for(int i=1; i<count+1; i++){
            dt[i] = Long.parseLong(br.readLine());
        }


        dp[1] =  dt[1];
        dp[2] = dt[1]+dt[2];
        dp[3]= Math.max(dt[1]+dt[3], dt[2]+dt[3]);

        for(int i=4; i<count+1; i++){
            dp[i] = dp[i-2]+dt[i];
            dp[i] = Math.max(dp[i],dp[i-3]+dt[i]+dt[i-1]);



        }

        System.out.println(dp[count]);

        bw.flush();







    }







};
