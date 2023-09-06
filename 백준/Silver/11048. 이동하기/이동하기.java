import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[][] dp = new long[n+1][m+1];
        long[][] dt = new long[n+1][m+1];

        for(int i=1; i<n+1; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<m+1; j++){
                dt[i][j] = Long.parseLong(st.nextToken());
            }
        }

        for(int i=1; i<n+1; i++){
            dp[i][1] = dt[i][1];
        }


        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                dp[i][j] = dp[i-1][j]+dt[i][j];
                dp[i][j] = Math.max(dp[i][j],dp[i-1][j-1]+dt[i][j]);
                dp[i][j] = Math.max(dp[i][j],dp[i][j-1]+dt[i][j]);
            }
        }

        System.out.println(dp[n][m]);






    }







};
