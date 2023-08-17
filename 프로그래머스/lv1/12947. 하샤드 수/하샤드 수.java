class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = "";
        str += x;
        x = 0;
        for(int i=0; i<str.length(); i++){
            x += str.charAt(i) - '0';
        }
        return Integer.parseInt(str) % x == 0 ? true : false;
    }
}