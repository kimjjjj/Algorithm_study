import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        /********** code 1 **********/
        List<Integer> list = new ArrayList<Integer>();
        
        list.add(score[0]);
        answer[0] = score[0];
        int idx = 1;
        
        for (int i=1; i<score.length; i++) {
            list.add(score[i]);
            
            list.sort(Collections.reverseOrder());
            
            if (list.size() > k) {
                list.remove(list.size()-1);
            }
            
            answer[idx] = list.get(list.size()-1);
            idx++;
        }
        /****************************/
        
        /********** code 2 **********/
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        
        for (int i=0; i<score.length; i++) {
            priorityQueue.add(score[i]);
            
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
            
            answer[i] = priorityQueue.peek();
        }
        /****************************/
        
        return answer;
    }
}
