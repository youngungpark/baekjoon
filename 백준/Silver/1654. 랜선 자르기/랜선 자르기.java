
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
        StringTokenizer st = new StringTokenizer(br.readLine());
       
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
    
        long[] arr = new long[n];
        
        for(int i=0; i<n; i++) {
        	arr[i] = Long.parseLong(br.readLine());
        }
        
        
        long start = 0;
        long end = Long.MAX_VALUE;
        long result = 0;
        
        while(start<=end) {
        	int total = 0;
        	long mid = (start+end)/2;
        	
        	for(int i=0; i<n; i++) {
        		total += arr[i]/mid;
        	}
        	
        	if(total < k) {
        		end = mid-1;
        	}else {
        		start = mid+1;
        		result = mid;
        	}
        	
        }
        System.out.print(result);
        
	}

}
