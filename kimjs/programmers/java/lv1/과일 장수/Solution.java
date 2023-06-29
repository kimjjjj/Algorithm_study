import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);

        /******** code 1 ********/
        List<Integer> list = new ArrayList<>();
        
        for (int i=score.length-1; i>=0; i--) {
            list.add(score[i]);
            
            if (list.size() == m) {
                answer += (list.get(m-1) * m);
                list.clear();
            }
        }
        /************************/

        /******** code 2 ********/
        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }
        /************************/
        
        return answer;
    }
}
