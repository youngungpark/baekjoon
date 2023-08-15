import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        
        for(int i=0; i<arr.length; i++){
            if(list.get(list.size()-1) != arr[i]){
                list.add(arr[i]);
            }
        }
       
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}