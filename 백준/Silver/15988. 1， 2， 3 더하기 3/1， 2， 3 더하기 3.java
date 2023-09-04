
import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        long result = 0;
        long [] dp = new long[1000001];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;



        for(int i=0; i<count; i++){
            int n = Integer.parseInt(br.readLine());
            for(int j=4; j<n+1; j++){
                dp[j] = (dp[j-1] + dp[j-2] + dp[j-3]) % 1000000009;
            }
            bw.write(dp[n]+"\n");
        }


        bw.flush();





    }







};
