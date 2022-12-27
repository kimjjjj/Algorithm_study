class Solution {
    public long solution(long n) {
        // Math.sqrt(a) : 제곱근 출력(double)
        // Math.pow(a, b) : 거듭 제곱 출력(double)
        long answer = 0;
        int intNum = (int) Math.sqrt(n);
        double douNum = Math.sqrt(n);
        
        if(douNum % intNum == 0) {
            answer = (long) Math.pow(intNum + 1, 2);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}
