class Solution {
    boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        int count = 0;
        
        if(arr[0] == ')') return false;
        
        for(int i=0; i<s.length(); i++){
            if(arr[i] == '('){
                count ++;
            }else{
                count --;
            }
            
            if(count == -1){
                return false;
            }
        }
        
        
        
        return count == 0 ? true : false;
    }
}