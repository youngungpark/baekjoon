import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        long[][] dp = new long[count+1][count+1];
        long[][] dt = new long[count+1][count+1];

        for(int i=1; i<count+1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<count+1; j++){
                if(st.hasMoreTokens()){
                    dt[i][j] = Long.parseLong(st.nextToken());
                }else{
                    break;
                }
            }
        }

        dp[1][1] = dt[1][1];

        long result = 0;

        for(int i=1; i<count+1; i++){
            for(int j=1; j<count+1; j++){
                dp[i][j] = Math.max(dp[i-1][j-1]+dt[i][j],dp[i-1][j]+dt[i][j]);
                result = Math.max(dp[i][j],result);
            }
        }

        System.out.println(result);

    }







};
