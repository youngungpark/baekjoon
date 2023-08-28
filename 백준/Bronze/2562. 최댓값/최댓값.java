
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = null;
        int count = 0;
        int max = 0;
        int maxIdx =0;
        
        while ((str = br.readLine()) != null){
            count++;
            int num = Integer.parseInt(str);
            if(max < num) {
                max = num;
                maxIdx = count;
            }
        }
        System.out.println(max);
        System.out.print(maxIdx);
        

    }
}