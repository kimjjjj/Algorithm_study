class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 최대공약수
        int a = med(Math.max(n, m), Math.min(n, m));
        
        // 최소공배수
        int b = n * m / a;
        
        answer[0] = a;
        answer[1] = b;
        
        return answer;
    }
    
    static int med(int a, int b) {
        if (b == 0)
            return a;
        return med(b, a%b);
    }
}
