class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        
        int quo = 0;
        for (int i=3; i<=brown; i++) {
            if ((brown + yellow) % i == 0) {
                quo = (brown + yellow) / i;
                
                if (quo * 2 + (i - 2) * 2== brown) {
                    answer[0] = Math.max(quo, i);
                    answer[1] = Math.min(quo, i);
                    break;
                }
            }
        }
        
        return answer;
    }
}
