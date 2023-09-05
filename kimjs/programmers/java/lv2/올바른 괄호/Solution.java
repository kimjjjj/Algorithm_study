class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int cnt = 0;
        
        for (int i=0; i<s.length(); i++) {
            
            cnt = s.charAt(i) == '(' ? cnt+1 : cnt-1;
            
            if (cnt == 0) {
                answer = true;
            } else if (cnt > 0) {
                answer = false;
            } else {
                answer = false;
                return answer;
            }
        }
        
        return answer;
    }
}
