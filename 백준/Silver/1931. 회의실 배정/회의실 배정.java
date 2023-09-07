import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] A = new int[n][2];
        for (int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            A[i][0] = Integer.parseInt(st.nextToken());
            A[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] S, int[] E) {
                if(S[1] == E[1]){
                    return S[0] - E[0];
                }
                return S[1] - E[1];
            }
        });
        int count = 0;
        int end = -1;
        for(int i=0; i< n; i++){
            if(A[i][0] >= end){
                end = A[i][1];
                count++;
            }
        }

        System.out.println(count);

    }
}
