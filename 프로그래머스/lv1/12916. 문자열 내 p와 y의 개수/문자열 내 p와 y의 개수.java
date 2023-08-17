class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int[] check = new int[2];

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                check[0] += 1;
            }else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                check[1] += 1;
            }
        }

        return check[0] == check[1] ? true : false;
    }
}