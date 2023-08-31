
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[26];

        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }

        char[] charArr = br.readLine().toCharArray();

        for(int i=0; i<charArr.length; i++){
            if(arr[(charArr[i]-97)] == -1){
                arr[(charArr[i]-97)] = i;
            }

        }

        for(int i : arr){
            System.out.print(i+" ");
        }


        bw.flush();
    }
};