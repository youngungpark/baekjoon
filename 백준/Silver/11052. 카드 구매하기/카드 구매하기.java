
import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());


        int[] cardArr = new int[count+1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=1; i<=count; i++){
            cardArr[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[count+1];

       dp[1] = cardArr[1];

        for(int i=2; i<=count; i++){
            for(int j=1; j<=i; j++){
                dp[i] = Math.max(dp[i],dp[i-j]+cardArr[j]);
            }
        }

        System.out.println(dp[count]);










    }







};
