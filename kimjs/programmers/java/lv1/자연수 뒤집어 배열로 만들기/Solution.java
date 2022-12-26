class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int strLen = str.length();
        
        int[] answer = new int[strLen];
        
        for(int i=0; i<strLen; i++) {
            answer[i] = (int)(n%10);
            n/=10;
        }
        
        return answer;
    }
}
