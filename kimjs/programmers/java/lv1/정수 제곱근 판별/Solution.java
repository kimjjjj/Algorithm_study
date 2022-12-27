class Solution {
    public long solution(long n) {
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
