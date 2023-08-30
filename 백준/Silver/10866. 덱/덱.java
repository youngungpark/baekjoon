
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<String> list = new LinkedList<>();
        int count = Integer.parseInt(br.readLine());

        while(count > 0){
            count--;
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            if ("push_front".equals(cmd)){
                list.addFirst(st.nextToken());
            } else if ("push_back".equals(cmd)) {
                list.addLast(st.nextToken());
            } else if ("pop_front".equals(cmd)) {
                bw.write(list.size() != 0 ? list.poll()+"\n" : "-1\n");
            } else if ("pop_back".equals(cmd)) {
                bw.write(list.size() != 0 ? list.pollLast()+"\n" : "-1\n");
            } else if ("size".equals(cmd)) {
                bw.write(list.size()+"\n");
            } else if ("empty".equals(cmd)) {
                bw.write(list.isEmpty() ? "1\n" : "0\n");
            } else if ("front".equals(cmd)) {
                bw.write(list.isEmpty() ? "-1\n" : list.peekFirst()+"\n");
            } else if ("back".equals(cmd)) {
                bw.write(list.isEmpty() ? "-1\n" : list.peekLast()+"\n");
            }
        }
        bw.flush();
//        StringTokenizer st = new StringTokenizer(br.readLine());


    }
}