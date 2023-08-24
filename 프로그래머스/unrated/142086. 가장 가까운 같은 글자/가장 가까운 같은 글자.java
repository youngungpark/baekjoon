import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        LinkedList<String> link = new LinkedList<String>();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(link.lastIndexOf(arr[i]+"") == -1){
               answer[i] = link.lastIndexOf(arr[i]+"");  
            }else{
               answer[i] = i-link.lastIndexOf(arr[i]+"");  
            }
            link.add((char)(arr[i])+"");
            
        }
        
        return answer;
    }
}