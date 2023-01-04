class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long max = Math.max(b, a), min = Math.min(a, b);
        
        /********** code 1 **********/
        for (long i=min; i<=max; i++) answer += i;
        /****************************/
        
        /****** code 2 등차수열 ******/
        answer = (max - min + 1) * (min + max) / 2;
        /****************************/
        
        return answer;
    }
}
