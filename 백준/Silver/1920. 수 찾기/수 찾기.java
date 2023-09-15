

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(A);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<M; i++) {
			int target = Integer.parseInt(st.nextToken());
			
			int result = binarySearch(A,target);
			System.out.println(result);
		}
	}
	
	public static int binarySearch(int[] sortArr , int target) {
		
		int left = 0;
		int right = sortArr.length-1;
		
		int result = 0;
		
		while(left<=right) {
			int mid = (left+right)/2;
			
			if(sortArr[mid] == target) {
				result = 1;
				break;
			}else if(sortArr[mid] > target) {
				right  = mid-1;
			}else if(sortArr[mid] < target) {
				left = mid+1;
			}
		}
		
		return result;
		
	}

}
