import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int[] dt = new int[count+1];
        int[] dp = new int[count+1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=1; i<count+1; i++){
            dt[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = 1;
        int max = 0;

        for(int i=2; i<count+1; i++){
            for(int j=1; j<=i; j++){
                if(dt[i]>dt[j]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] = max+1;
            max = 0;
        }

        for(int i : dp){
            if(max<i){
                max = i;
            }
        }

        bw.write(max+"");
        bw.flush();





    }







};
