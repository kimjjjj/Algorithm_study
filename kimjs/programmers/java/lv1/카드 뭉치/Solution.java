import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        Queue<String> queueCards1 = new LinkedList<String>();
        Queue<String> queueCards2 = new LinkedList<String>();
        Queue<String> queueGoal = new LinkedList<String>();
        
        for (int i=0; i<cards1.length; i++) {
            queueCards1.add(cards1[i]);
        }
        
        for (int i=0; i<cards2.length; i++) {
            queueCards2.add(cards2[i]);
        }
        
        for (int i=0; i<goal.length; i++) {
            queueGoal.add(goal[i]);
        }
        
        for (int i=0; i<goal.length; i++) {
            if (goal[i].equals(queueCards1.peek())) {
                queueCards1.poll();
                queueGoal.poll();
            } else if (goal[i].equals(queueCards2.peek())) {
                queueCards2.poll();
                queueGoal.poll();
            }
        }
        
        if(queueGoal.size() == 0) {
            answer = "Yes";
        } else if (queueCards1.size() == 0 && queueCards2.size() == 0) {
            answer = "Yes";
        } else {
            answer = "No";
        }
        
        return answer;
    }
}
