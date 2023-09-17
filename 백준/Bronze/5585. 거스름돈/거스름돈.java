
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int[] en = {500,100,50,10,5,1};

        int count = 0;

        int n = 1000;

        n = n - Integer.parseInt(br.readLine());

        while(n!=0){

            for(int i=0; i<en.length; i++){
                if(en[i]<=n){
                    count += n/en[i];
                    n = n%en[i];
                }
            }
        }

        System.out.println(count);


    }
}
