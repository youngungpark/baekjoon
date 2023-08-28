
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] arr = br.readLine().split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);

        for(String value : arr){
            int num = Integer.parseInt(value);

            if(min > num) min = num;

            if(max < num) max = num;
        }
        System.out.print(min+" "+max);

    }
}