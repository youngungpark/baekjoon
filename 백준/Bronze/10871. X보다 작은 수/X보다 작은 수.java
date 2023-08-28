
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int condition = Integer.parseInt(st.nextToken());

        String[] arr = new String[count];
        arr = br.readLine().split(" ");
        for(int i=0; i<arr.length; i++){
            if(condition>Integer.parseInt(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }

    }
}