
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> set = new HashSet<>();
        String str = null;
        while ((str = br.readLine()) != null){
            int num = Integer.parseInt(str) % 42;
            set.add(num);
        }
        System.out.println(set.size());
    }
}