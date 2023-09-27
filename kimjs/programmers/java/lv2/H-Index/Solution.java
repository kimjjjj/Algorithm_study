class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        for (int i=citations.length; i>0; i--) {
            
            int above = 0, below = 0;
            for (Integer num : citations) {
                if (num >= i) above++;
                else if (num <= i) below++;
            }
            
            if (above >= i && below <= i) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
