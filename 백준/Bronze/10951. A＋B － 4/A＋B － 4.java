
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


//        int count = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        String str = null;
        while ((str = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(str," ");
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                bw.write((a + b) + "\n");


        }
        bw.flush();
    }
}