import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String s = "";
        
        String[] array = String.valueOf(n).split("");
        Arrays.sort(array, Collections.reverseOrder());
        
        for (int i=0; i<array.length; i++) s += array[i];
        
        long answer = Long.parseLong(s);
        
        return answer;
    }
}
