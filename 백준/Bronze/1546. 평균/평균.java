import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int sum = 0;
        int temp = 0;
        for(int i=0; i<n; i++){
            temp = sc.nextInt();
            sum += temp;
            if(max < temp){
                max = temp;
            }

        }
        System.out.println((double)sum/max*100/n);
    }
}