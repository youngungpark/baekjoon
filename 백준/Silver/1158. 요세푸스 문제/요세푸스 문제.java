
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> stack = new LinkedList<>();
        int count = Integer.parseInt(st.nextToken());
        int condition =  Integer.parseInt(st.nextToken());

        bw.write("<");
        for(int i=0; i<count; i++){
            stack.add(i+1);
        }

        while(stack.size()!=1){
            for(int i=0; i<condition-1; i++){
                stack.add(stack.poll());
            }
            bw.write(stack.poll()+", ");
        }



        bw.write(stack.poll()+">");
        bw.flush();
//        StringTokenizer st = new StringTokenizer(br.readLine());


    }
}