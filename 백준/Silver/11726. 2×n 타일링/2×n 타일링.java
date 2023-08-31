
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// 1부터 시작하기에 +1
		int[] arr = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			if(i==1) {
				arr[i] = 1;
			}else if(i==2) {
				arr[i] = 2;
			}else {
				arr[i] = (arr[i-2] + arr[i-1]) % 10007;
			}
		}
		System.out.println(arr[n]);
	}
	

}
