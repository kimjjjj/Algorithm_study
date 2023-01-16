class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i=0; i<absolutes.length; i++) {
            /********** code 1 **********/
            answer += absolutes[i] * (signs[i] ? 1 : -1);
            /****************************/
            
            /********** code 2 **********/
            if (signs[i] == false) absolutes[i] *= -1;
            
            answer += absolutes[i];
            /****************************/
        }
        
        return answer;
    }
}
