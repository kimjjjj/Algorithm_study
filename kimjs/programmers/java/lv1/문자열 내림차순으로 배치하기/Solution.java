import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        /********** code 1 **********/
        String[] arr = s.split("");
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        answer = String.join("", arr);
        /****************************/
        
        /********** code 2 **********/
        char[] arr = s.toCharArray();
        
        Arrays.sort(arr);
        
        answer = new StringBuilder(new String(arr)).reverse().toString();
        /****************************/
        
        return answer;
    }
}
