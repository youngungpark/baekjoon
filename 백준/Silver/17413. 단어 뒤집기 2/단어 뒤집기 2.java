
import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LinkedList<String> list = new LinkedList<>();
        char[] charArr = br.readLine().toCharArray();

        for(int i=0; i<charArr.length; i++){

            if(charArr[i]=='<'){
                if(list.size() != 0){
                    for(String str : list){
                        bw.write(str);
                    }
                    list.clear();
                }
                int temp = 0;
                for(int j=i; j<charArr.length; j++){
                    if(charArr[j] == '>'){
                        bw.write(charArr[j]);
                        temp = j;
                        break;
                    }else {
                        bw.write(charArr[j]);
                    }
                }
                i = temp;
                continue;
            }

            if(charArr[i] == 32){
                for(String str : list){
                    bw.write(str);
                }
                bw.write(" ");
                list.clear();
            }else{
                list.addFirst(String.valueOf(charArr[i]));

            }
        }
        for(String str : list){
            bw.write(str);
        }


        bw.flush();
//        StringTokenizer st = new StringTokenizer(br.readLine());


    }
}