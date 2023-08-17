import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int temp = 0;
        
        // for(int i=0; i<d.length; i++){
        //     for(int j=1; j<d.length; j++){
        //         if(d[i]<d[j]){
        //             temp = d[i];
        //             d[i] = d[j];
        //             d[j] = temp;
        //         }
        //     }
        // }
        
        Arrays.sort(d);
        temp = 0;
        
        for(int i=0; i<d.length; i++){
            temp += d[i];
            if(temp > budget){
                answer = i;
                break;
            }
           
        }
        if(temp <= budget){
            answer = d.length;
        }
        return answer;
    }
}