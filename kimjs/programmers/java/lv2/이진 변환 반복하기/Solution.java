import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        
        while (!"1".equals(s)) {
            /********** code 1 **********/
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == '0') {
                    answer[1]++;
                }
            }
            
            s = Integer.toBinaryString(s.replaceAll("0", "").length());
            
            answer[0]++;
            /****************************/
            
            /********** code 2 **********/
            answer[1] += s.length();
            
            s = s.replaceAll("0", "");
            
            answer[1] -= s.length();
            
            s = Integer.toBinaryString(s.length());
            
            answer[0]++;
            /****************************/
        }
        
        return answer;
    }
}
