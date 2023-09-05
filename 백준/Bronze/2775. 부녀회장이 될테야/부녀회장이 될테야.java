import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        long result = 0;

//        long [][] dt = new long[count+1][15];


        for(int i=0; i<count; i++){
            int floor = Integer.parseInt(br.readLine());
            int number = Integer.parseInt(br.readLine());
            long [][] dp = new long[floor+1][15];
            for(int j=1; j<15; j++){
                dp[0][j] = j;
            }

            for(int k=1; k<floor+1; k++){
                for(int h=1; h<number+1; h++){
                    for(int m=1; m<h+1; m++){
                        dp[k][h] += dp[k-1][m];
                    }
                }
            }

            bw.write(dp[floor][number]+"\n");

        }

//        bw.write(result+"");

        bw.flush();





    }







};
