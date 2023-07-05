class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=2; i<=n; i++) {
            if (isPrime(i) == 1) answer++;
        }
        return answer;
    }
    
    static int isPrime(int num) {
        
        for (int i=2; i<=Math.sqrt(num); i++) {
            
            if (num % i == 0) {
                
                return 0;
            }
        }
        
        return 1;
    }
}
