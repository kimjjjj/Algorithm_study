import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        List<Character> list = new ArrayList<>();
        for (int i=0; i<skip.length(); i++) {
            list.add(skip.charAt(i));
        }
        
        for (int i=0; i<s.length(); i++) {
            
            int num = s.charAt(i);
            int idx = 0;
            
            while (idx < index) {
                
                num += 1;
                
                if (num > 122) {
                    num = 97;
                }
                
                if (!list.contains((char)num)) {
                    idx++;
                }
            }
            
            answer.append((char)num);
        }
        
        return answer.toString();
    }
}
