
import java.io.*;
import java.sql.Array;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int length = Integer.parseInt(st.nextToken());

        int count = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] arr = new int[length+1];
        int[] sumArr = new int[length+1];

        for(int i=1; i<arr.length; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        sumArr[1] = arr[1];

        for(int i=2; i<arr.length; i++){
            sumArr[i] = sumArr[i-1] + arr[i];
        }

//        for(int i : sumArr){
//            System.out.print(i+" ");
//        }
        for(int i=1; i<=count; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st3.nextToken());
            int num2 = Integer.parseInt(st3.nextToken());
            bw.write(sumArr[num2] - sumArr[num-1]+"\n");
        }
        bw.flush();

    }







};
