
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


//        int count = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        int c = Integer.parseInt(br.readLine());
        String[] arr = new String[a];
        arr = b.split(" ");
        int count = 0;
        for(int i=0; i<arr.length; i++){
           if(c == Integer.parseInt(arr[i])) count ++;
        }

        System.out.println(count);
    }
}