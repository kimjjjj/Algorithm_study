class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        int loop = 0, tube = 1;
        while (loop < t*m) {
            
            String[] strArr = Integer.toString(loop, n).split("");
            
            for (String str : strArr) {
                
                if (p == tube) answer += str;
                
                if (t == answer.length()) break;
                
                if (tube == m) tube = 0;
                
                tube++;
            }
            
            if (t == answer.length()) break;
            
            loop++;
        }
        
        return answer.toUpperCase();
    }
}
