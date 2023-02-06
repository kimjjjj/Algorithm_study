class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i=left; i<=right; i++) {
            /********** code 1 **********/
            int cnt = 0;
            
            for (int j=1; j<=i; j++) if (i % j == 0) cnt++;
            
            if ((cnt & 1) == 0) answer += i;
            else answer -= i;
            /****************************/
            
            /********** code 2 **********/
            if (i % Math.sqrt(i) == 0) answer -= i;
            else answer += i;
            /****************************/
        }
        
        return answer;
    }
}
