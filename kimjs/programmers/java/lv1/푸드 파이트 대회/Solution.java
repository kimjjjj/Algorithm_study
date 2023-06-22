class Solution {
    public String solution(int[] food) {
        /********** code 1 **********/
        String answer = "";
        int foodLen = food.length;

        for (int i=1; i<foodLen; i++) {
            int len = food[i]/2;
            
            for (int j=0; j<len; j++) answer += i;
        }
            
        answer += 0;
            
        for (int i=foodLen-1; i>0; i--) {
            int len = food[i]/2;
            
            for (int j=0; j<len; j++) answer += i;
        }
        /****************************/

        /********** code 2 **********/
        String answer = "0";
        int foodLen = food.length;
        
        for (int i=foodLen-1; i>0; i--) {
            
            int len = food[i]/2;
            
            for (int j=0; j<len; j++) answer = i + answer + i;
        }
        /****************************/
                
        return answer;
    }
}
