
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] iron = new int[n];

        for(int i=0; i<n; i++){
            iron[i] = Integer.parseInt(st.nextToken());
        }
        int target = Integer.parseInt(br.readLine());

        Arrays.sort(iron);

        int count =0;
        int i=0;
        int j = n-1;

        while(i<j){
            if(iron[i]+iron[j] < target){
                i++;
            }else if(iron[i]+iron[j] > target){
                j--;
            }else{
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);

    }
}
