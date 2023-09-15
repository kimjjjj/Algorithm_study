class Solution {
    public int solution(int n, int a, int b) {
        int answer = 1;
        
        while (a != b) {
            
            if (a%2 == 0) {
                if (a-1 == b) {
                    break;
                }
            } else {
                if (a+1 == b) {
                    break;
                }
            }
            
            a = (int) Math.ceil((double) a/2);
            b = (int) Math.ceil((double) b/2);
            answer++;
        }

        return answer;
    }
}
