import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];

        dp[1] = 1;
        dp[2] = 3;
        for(int i=3; i<count+1; i++){
            dp[i] = (dp[i-1] + dp[i-2]*2)%10007;
        }

        bw.write(dp[count]%10007+"\n");
        bw.flush();





    }







};
