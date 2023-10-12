import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i=0; i<progresses.length; i++) {
            queue.add((int) Math.ceil((double) (100 - progresses[i])/speeds[i]));
        }
        
        List<Integer> list = new ArrayList<>();
        
        int cnt = 1;
        while (!queue.isEmpty()) {
            int target = queue.poll();
            int len = queue.size();
            
            if (!queue.isEmpty()) {
                for (int i=0; i<len; i++) {
                    if (target >= queue.peek()) {
                        queue.poll();
                        cnt++;
                    } else {
                        list.add(cnt);
                        cnt = 1;
                        break;
                    }
                }
            } else {
                list.add(cnt);
                cnt = 1;
            }
        }
        
        if (cnt > 1) {
            list.add(cnt);
        }
        
        int[] answer = new int[list.size()];
        
        int idx = 0;
        for (int temp : list) {
            answer[idx++] = temp;
        }
        
        return answer;
    }
}
