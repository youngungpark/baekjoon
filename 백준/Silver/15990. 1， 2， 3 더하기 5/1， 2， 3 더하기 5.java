import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        long[][] dp = new long[100001][4];
        dp[1][1] = 1;
        dp[2][2] = 1;
        dp[3][3] = 1;
        dp[3][1] = 1; // 2+1
        dp[3][2] = 1; // 1+2

        for(int j=4; j<100001; j++){
            dp[j][1] = (dp[j-1][2] + dp[j-1][3]) %1_000_000_009;
            dp[j][2] = (dp[j-2][1] + dp[j-2][3]) %1_000_000_009;
            dp[j][3] = (dp[j-3][1] + dp[j-3][2]) %1_000_000_009;
        }
        
        for(int i=0; i<count; i++){
            int num = Integer.parseInt(br.readLine());

            
            bw.write((dp[num][1]+dp[num][2]+dp[num][3])%1_000_000_009+"\n");
        }



        bw.flush();







    }







};
