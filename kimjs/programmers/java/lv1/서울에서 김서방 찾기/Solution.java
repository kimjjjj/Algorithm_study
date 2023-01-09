import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        /********** code 1 **********/
        for (int i=0; i<seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                answer = ("김서방은 " + i + "에 있다");
                break;
            }
        }
        /****************************/
        
        /********** code 2 **********/
        int idx = Arrays.asList(seoul).indexOf("Kim");
        answer = ("김서방은 " + i + "에 있다");
        /****************************/
        
        return answer;
    }
}
