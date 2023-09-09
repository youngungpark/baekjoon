import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = Integer.parseInt(st.nextToken());
        int count = 1;
        int number = 666;
        if(result == 1){
            System.out.println(number);
            System.exit(0);
        }
        while(true){
            number ++;
            if(String.valueOf(number).contains("666")){
                count++;
            }

            if(count == result){
                break;
            }
        }
        System.out.println(number);
    }

}
