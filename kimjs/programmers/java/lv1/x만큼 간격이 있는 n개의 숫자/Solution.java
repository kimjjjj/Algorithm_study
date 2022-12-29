class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        /******** code 1 ********/
        for (int i=0; i<n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        /************************/
        
        /******** code 2 ********/
        answer[0] = (long) x;
        
        for (int i=1; i<n; i++) {
            answer[i] = answer[i - 1] + (long) x;
        }
        /************************/
        
        return answer;
    }
}
