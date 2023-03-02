class Solution {
    public int solution(int a, int b, int n) {
        int answer = n / a * b;
        int quo = n / a * b;
        int rem = n % a;
        
        while (true) {
            quo += rem;
            rem = 0;
            
            answer += quo / a * b;
            rem += quo%a;
            quo = quo / a * b;
            
            if (quo + rem < a) break;
        }
        
        return answer;
    }
}
