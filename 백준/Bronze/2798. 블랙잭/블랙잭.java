import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long result = 0;

        for(int i=0; i<count-2; i++){
            for(int j=i+1; j<count-1; j++){
                for(int k=j+1; k<count; k++){
                    long temp = arr[i]+arr[j]+arr[k];
                    if(num>=temp){
                        result = Math.max(result,temp);
                    }
                }
            }
        }

        System.out.println(result);



    }
}
