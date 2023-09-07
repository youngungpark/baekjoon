import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int eScope = 1;
        int sScope = 1;
        int mScope = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long year = 1;
        while(true) {
            if(e==eScope && s==sScope && m==mScope){
                System.out.println(year);
                break;
            }

            eScope++;
            sScope++;
            mScope++;
            year++;

            if(eScope==16){
                eScope = 1;
            }

            if(sScope==29){
                sScope=1;
            }

            if(mScope==20){
                mScope=1;
            }
        }

    }







};
