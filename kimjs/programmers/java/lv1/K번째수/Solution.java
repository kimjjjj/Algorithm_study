import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int start = 0, end = 0, target = 0;
        
        for (int i=0; i<commands.length; i++) {
            
            start = commands[i][0];
            end = commands[i][1];
            target = commands[i][2];
            
            int[] tempArr = new int[end - start + 1];
            
            int cnt = 0;
            for (int j=start-1; j<end; j++) {
                
                tempArr[cnt] = array[j];
                cnt++;
                
            }
            
            Arrays.sort(tempArr);
            
            answer[i] = tempArr[target-1];
        }
        
        return answer;
    }
}
