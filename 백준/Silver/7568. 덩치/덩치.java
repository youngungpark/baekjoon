import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[][] arr = new int[count][2];

        for(int i=0;i<count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<count; i++){
            int rank = 0;
            for(int j=0; j<count; j++){
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1] ){
                    rank++;
                }
            }
            bw.write((rank+1)+" ");
        }
        bw.flush();

    }

}
