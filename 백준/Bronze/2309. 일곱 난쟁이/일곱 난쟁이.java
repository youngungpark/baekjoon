import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dt = new int[9];

        int sum = 0;

        for(int i=0; i<9; i++){
            dt[i] = Integer.parseInt(br.readLine());
            sum += dt[i];
        }

        Arrays.sort(dt);

        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if(dt[i]+dt[j] == sum-100){
                    for(int k=0; k<9; k++){
                        if(k==i || k==j){

                        }else{
                            System.out.println(dt[k]);
                        }

                    }
                    System.exit(0);

                }
            }
        }


    }
}
