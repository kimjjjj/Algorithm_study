import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = -1;
        
        Stack<String> stack = new Stack<>();
        
        String[] arr = s.split("");
        
        for (String str : arr) {
            
            if (stack.empty()) {
                stack.add(str);
            } else {
                if (str.equals(stack.peek())) {
                    stack.pop();
                } else {
                    stack.add(str);
                }
            }
        }
        
        answer = stack.empty() ? 1 : 0;

        return answer;
    }
}
