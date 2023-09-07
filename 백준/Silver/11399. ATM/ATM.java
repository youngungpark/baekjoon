import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dt = new int[count];

        for(int i=0; i<count; i++){
            dt[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(dt);

        long result = dt[0];
        for(int i=1; i<count; i++){
            dt[i] = dt[i-1] + dt[i];
            result += dt[i];
        }

        System.out.println(result);


    }
}
