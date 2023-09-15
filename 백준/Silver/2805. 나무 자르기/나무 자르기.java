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
        int m = Integer.parseInt(st.nextToken());
        int maxLength = 0;
        Long result = 0L;
        
        int[] wood = new int[n];
        
        st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n; i++) {
        	wood[i] = Integer.parseInt(st.nextToken());
        }
        
        Long start = 0L;
        Long end = Long.MAX_VALUE;
        
        while(start<=end) {
        	Long total = 0L;
        	Long mid = (start+end)/2;
        	
        	for(int i=0; i<n; i++) {
        		if(wood[i] > mid) {
        			total += wood[i] - mid; 
        		}
        		
        	}
        	
        	if(total>=m) {
        		start = mid+1;
        		result = mid;
        	}else {
        		end = mid-1;
        	}
        
        }
        
        System.out.println(result);
        
	}

}
