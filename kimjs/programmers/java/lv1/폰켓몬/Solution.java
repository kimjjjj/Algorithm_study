import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int half = nums.length/2;
        
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        
        if (half < set.size()) answer = half;
        else answer = set.size();
        
        return answer;
    }
}
