import java.io.*;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String st = br.readLine();

            if(st.equals("0")){
                bw.flush();
                break;
            }

            String compare = "";

            for(int i=st.length()-1; i>=0; i--){
                compare += st.charAt(i);
            }

            if(compare.equals(st)){
                bw.write("yes\n");
            }else{
                bw.write("no\n");
            }



        }



    }

}
