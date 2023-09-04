
import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        long result = 0;
        long [] dp = new long[count+1];
        long [] dt = new long[count+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=1; i<count+1; i++){
            dt[i] = Long.parseLong(st.nextToken());
        }
        dp[1] = dt[1];

        result = dt[1];

        for(int i=2; i<count+1; i++){
            dp[i] = Math.max(dt[i]+dp[i-1],dt[i]);
            result = Math.max(result,dp[i]);
        }

        bw.write(result+"");


        bw.flush();





    }







};
