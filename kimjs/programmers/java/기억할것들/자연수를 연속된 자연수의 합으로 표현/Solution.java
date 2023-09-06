class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=n; i+=2) {
            answer = n % i == 0 ? answer+1 : answer;
        }
        
        return answer;
    }
}
