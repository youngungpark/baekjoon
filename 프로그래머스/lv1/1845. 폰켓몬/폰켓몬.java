import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet();

        for(int num : nums){
            set.add(num);
        }

        
        return set.size() >= nums.length/2 ? nums.length/2 : set.size();
    }
}