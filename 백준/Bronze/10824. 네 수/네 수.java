
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());

        String ab = st.nextToken()+st.nextToken();
        String cd = st.nextToken()+st.nextToken();

        System.out.print(Long.parseLong(ab)+Long.parseLong(cd));



    }
};