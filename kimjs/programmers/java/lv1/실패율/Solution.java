import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        int[] tempStages = new int[N];
        for (int i=0; i<stages.length; i++) {
            if (stages[i] <= N) {
                tempStages[stages[i]-1]++;
            }
        }
        
        PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Double> map = new HashMap<>();
        
        int size = stages.length;
        for (int i=1; i<=N; i++) {
            
            if (size != 0) {
                map.put(i, (double) tempStages[i-1]/size);
                queue.add((double) tempStages[i-1]/size);
            } else {
                map.put(i, 0.0);
                queue.add(0.0);
            }
            
            size -= tempStages[i-1];
        }
        
        size = queue.size();
        for (int i=0; i<size; i++) {
            
            double num = queue.poll();
            
            for (int j=1; j<=N; j++) {
                
                if (map.get(j) != null && num == map.get(j)) {
                    
                    answer[i] = j;
                    map.remove(j);
                    break;
                }
            }
        }
        
        return answer;
    }
}
