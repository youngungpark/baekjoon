
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));





        String str = "";
        while((str = br.readLine()) != null){
            int[] arr = new int[4];
            char[] charArr = str.toCharArray();

            for(int i=0; i<charArr.length; i++){
                if(charArr[i] >= 'a' && charArr[i] <= 'z'){ // 소문자일때
                    arr[0] += 1;
                }else if(charArr[i] >= 'A' && charArr[i] <= 'Z'){ // 대문자일때
                    arr[1] += 1;
                }else if(charArr[i] >= '0' && charArr[i] <= '9') { // 숫자일때
                    arr[2] += 1;
                }else{
                    arr[3] += 1;
                }
            }

            for(int i : arr){
                bw.write(i+" ");
            }
            bw.write("\n");
        }




        bw.flush();
    }
};