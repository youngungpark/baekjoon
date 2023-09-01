
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        char[] charArr = br.readLine().toCharArray();
        int sum = 0;
        for(int i=0; i<charArr.length; i++){
            sum += charArr[i]-'0';
        }
        System.out.print(sum);

    }
};