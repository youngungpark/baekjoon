import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int cycle = Integer.parseInt(st.nextToken());
            char[] arr = st.nextToken().toCharArray();

            for(int j=0; j<arr.length; j++){
                for(int k=0; k<cycle; k++){
                   sb.append(arr[j]);
                }

            }

            sb.append("\n");
        }
        System.out.println(sb);






    }
}
