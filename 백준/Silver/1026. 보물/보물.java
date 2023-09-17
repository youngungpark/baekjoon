
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        Integer[] arr2 = new Integer[n];

        for(int i=0; i<n; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        int result = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2,Collections.reverseOrder());

        for(int i=0; i<arr1.length; i++){
            result += arr1[i] * arr2[i];
        }

        System.out.println(result);
    }


}
