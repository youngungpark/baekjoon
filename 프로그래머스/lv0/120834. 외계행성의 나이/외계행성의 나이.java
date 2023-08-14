class Solution {
    public String solution(int age) {
        String abc = "abcdefghij";
        String answer = "";
        String str = age+"";
        for(int i=0; i<str.length(); i++){
            answer += abc.charAt(str.charAt(i)-'0');
        }
        return answer;
    }
}