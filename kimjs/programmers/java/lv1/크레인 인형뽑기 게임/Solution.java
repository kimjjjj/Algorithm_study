import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for (Integer i : moves) {
            
            for (int j=0; j<board.length; j++) {
                
                if (board[j][i-1] != 0) {
                    
                    if (!stack.empty()) {
                        
                        if (stack.peek() == board[j][i-1]) {
                            stack.pop();
                            board[j][i-1] = 0;
                            answer += 2;
                            break;
                        }
                    }
                    
                    stack.add(board[j][i-1]);
                    board[j][i-1] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}
