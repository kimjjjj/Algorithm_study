import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        /***** code 1 substring 이용 *****/
        String str = String.valueOf(n);
        
        for(int i=0; i<str.length(); i++) {
            answer += Integer.valueOf(str.substring(i,i+1));
        }
        /************ code 1 ************/
        
        /***** code 2 split 이용 *****/
        String[] array = String.valueOf(n).split("");
        
        for(int i=0; i<array.length; i++) {
            answer += Integer.parseInt((array[i]));
        }
        /********** code 2 **********/
        
        /***** code 3 toCharArray 이용 *****/
        char[] array = Integer.toString(n).toCharArray();
        
        for(int i=0; i<array.length; i++) {
            answer += Character.getNumericValue(array[i]); // char형을 int형으로 변환
            
            // 아스키코드 계산
            // answer += array[i] - 48;
            // answer += array[i] - '0';
        }
        /************* code 3 *************/
        
        return answer;
    }
}
