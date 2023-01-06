class Solution {
    public int solution(long num) {
        int answer = 0;
        
        if (num == 1) {
            answer = 0;
        } else {
            for (int i=1; i<=500; i++) {
                num = (num & 1) == 0 ? num / 2 : num * 3 + 1;
                answer = i;
                
                if (num == 1) break;
            }
            
            if (answer == 500) answer = -1;
        }
        
        return answer;
    }
}
