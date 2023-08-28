
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        String[] nm = br.readLine().split(" ");
        int[] arr = new int[Integer.parseInt(nm[0])+1];
        int count = Integer.parseInt(nm[1]);
        
        for(int i=1; i<arr.length; i++){
            arr[i] = i;
        }
        
        
        for(int x=1; x<=count; x++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp = arr[i];
            
            arr[i] = arr[j];
            arr[j] = temp;
            
        }

        for(int i=1; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }
}