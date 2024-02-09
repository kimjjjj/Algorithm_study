import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        
        String[] strArr = word.split("");
        
        Stack<String> stack = new Stack<>();
        
        int num = 0;
        String str = "";
        
        while (num < 4000) {
            answer++;
            
            if (stack.size() < 5) stack.add("A");
            else if (stack.size() == 5) {
                
                str = stack.pop();
                
                if ("A".equals(str)) stack.add("E");
                else if ("E".equals(str)) stack.add("I");
                else if ("I".equals(str)) stack.add("O");
                else if ("O".equals(str)) stack.add("U");
                else if ("U".equals(str)) {
                    
                    while ("U".equals(stack.peek())) stack.pop();
                    
                    str = stack.pop();
                    
                    if ("A".equals(str)) stack.add("E");
                    else if ("E".equals(str)) stack.add("I");
                    else if ("I".equals(str)) stack.add("O");
                    else if ("O".equals(str)) stack.add("U");
                }
            }
            
            if (Arrays.toString(strArr).equals(stack.toString())) break;
            
            num++;
        }
        
        return answer;
    }
}
