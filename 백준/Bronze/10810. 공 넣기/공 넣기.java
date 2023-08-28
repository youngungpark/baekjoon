
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        String[] nm = br.readLine().split(" ");
        int[] arr = new int[Integer.parseInt(nm[0])+1];
        int count = Integer.parseInt(nm[1]);

        for(int a=1; a<count+1; a++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for(int v = i; v<=j; v++){
                arr[v] = k;
            }
        }

        for(int x=1; x<arr.length; x++){
            System.out.print(arr[x]+" ");
        }


    }
}