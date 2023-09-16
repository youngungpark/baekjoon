
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dp = new int[5001];

        dp[3] = 1;
        dp[5] = 1;

        int n = Integer.parseInt(br.readLine());


        for(int i=6; i<n+1; i++){
            if(dp[i-3] != 0 && dp[i-5] != 0){
                dp[i] = Math.min(dp[i-3],dp[i-5]) +1;
            }else if(dp[i-5] != 0){
                dp[i] = dp[i-5] +1;
            }else if(dp[i-3] != 0){
                dp[i] = dp[i-3] +1;
            }


        }

        if(dp[n] == 0){
            System.out.println(-1);
        }else{
            System.out.println(dp[n]);
        }



    }
}
