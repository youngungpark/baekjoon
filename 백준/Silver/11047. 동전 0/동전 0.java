import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());

        long price = Integer.parseInt(st.nextToken());

        long result = 0;

        long[] dt = new long[count];
        long max = 0;


        for(int i=0; i<count; i++){
            dt[i] = Long.parseLong(br.readLine());
        }


            for (int i=dt.length-1; i>=0; i--) {
                if (dt[i] <= price) {
                    result += price / dt[i];
                    price = price % dt[i];
                }
            }




        System.out.println(result);


    }
}
