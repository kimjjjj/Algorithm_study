class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        
        for (int i=0; i<arr.length; i++) {
            char c = arr[i];
            int chInt = (int) c;
            
            if (chInt == 32) c = arr[i];
            else if (65 <= chInt && chInt <= 90) {
                
                if (90 < chInt + n) c = (char) (chInt + n - 26);
                else c = (char) (chInt + n);
                
            } else if (97 <= chInt && chInt <= 122) {
                
                if (122 < chInt + n) c = (char) (chInt + n - 26);
                else c = (char) (chInt + n);
                
            }
            
            answer += c;
        }
        
        return answer;
    }
}
