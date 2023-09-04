
import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        long result = 0;
        long [][] dp = new long[count+1][4];
        long [][] dt = new long[count+1][4];

        for(int i=1; i<count+1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<4; j++){
                int temp = Integer.parseInt(st.nextToken());
                dt[i][j] = temp;
            }
        }

        dp[1][1] = dt[1][1];
        dp[1][2] = dt[1][2];
        dp[1][3] = dt[1][3];


        for(int i=1; i<count+1; i++){
            dp[i][1] = Math.min(dp[i-1][2]+dt[i][1],dp[i-1][3]+dt[i][1]);
            dp[i][2] = Math.min(dp[i-1][1]+dt[i][2],dp[i-1][3]+dt[i][2]);
            dp[i][3] = Math.min(dp[i-1][2]+dt[i][3],dp[i-1][1]+dt[i][3]);
        }


        result = dp[count][1];

        for(int i=2; i<4; i++){
            result = Math.min(result,dp[count][i]);
        }

        bw.write(result+"");

        bw.flush();





    }







};
