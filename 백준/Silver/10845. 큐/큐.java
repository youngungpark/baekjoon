import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i=0; i<count; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();

            if(cmd.equals("push")){
                queue.add(Integer.valueOf(st.nextToken()));
            }else if(cmd.equals("pop")){
                sb.append(queue.isEmpty() ? "-1\n" : queue.poll()+"\n");
            }else if(cmd.equals("size")){
                sb.append(queue.size()+"\n");
            }else if(cmd.equals("empty")){
                sb.append(queue.isEmpty() ? "1\n" : "0\n");
            }else if(cmd.equals("front")){
                sb.append(queue.isEmpty() ? "-1\n" : queue.peekFirst()+"\n");
            }else if(cmd.equals("back")){
                sb.append(queue.isEmpty() ? "-1\n" : queue.peekLast()+"\n");
            }
        }

        System.out.println(sb.toString());

    }

}
