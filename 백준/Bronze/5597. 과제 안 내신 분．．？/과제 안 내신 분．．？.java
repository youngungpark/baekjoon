
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[30];

        for(int i=0; i<28; i++){
            int studentNum = Integer.parseInt(br.readLine());
            arr[studentNum-1] = studentNum+"";
        }

        for(int i=0;i<arr.length; i++){
            if(arr[i] == null){
                System.out.println(i+1);
            }
        }
    }
}