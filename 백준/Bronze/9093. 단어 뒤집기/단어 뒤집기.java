
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        int ct = 0;
        for(int i=0; i<count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                char[] charArr = st.nextToken().toCharArray();
                for(int j=charArr.length-1; j>=0; j--){
                    bw.write(charArr[j]);
                }
                bw.write(" ");
            }
            bw.write("\n");
        }
        bw.flush();
//        StringTokenizer st = new StringTokenizer(br.readLine());


    }
}