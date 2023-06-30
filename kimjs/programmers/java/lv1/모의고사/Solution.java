import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
		    int[] ansTemp = new int[3];
		
        int[] studentA = {1, 2, 3, 4, 5};
        int[] studentB = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] studentC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int scoreA = 0, scoreB = 0, scoreC = 0;
        
        for (int i=0; i<answers.length; i++) {
            if (answers[i] == studentA[i%5]) scoreA++;
            if (answers[i] == studentB[i%8]) scoreB++;
            if (answers[i] == studentC[i%10]) scoreC++;
        }
        
        ansTemp[0] = scoreA;
        ansTemp[1] = scoreB;
        ansTemp[2] = scoreC;
        
        int max = Math.max(ansTemp[0], Math.max(ansTemp[1], ansTemp[2]));
        
        List<Integer> list = new ArrayList<>();
        
        for (int i=0; i<3; i++) {
            if (max == ansTemp[i]) {
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
