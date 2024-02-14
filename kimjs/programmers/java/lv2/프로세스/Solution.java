import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        int tempLocation = location; // location의 현재 위치
        Map<Integer, Integer> map = new HashMap<>(); // 숫자 개수
        Deque<Integer> queue = new ArrayDeque<>();
        
        for(int n : priorities) {
            map.put(n, map.getOrDefault(n, 0)+1);
            queue.add(n);
        }
        
        while (queue.size() > 0) {
            int max = Collections.max(map.keySet());
            if (queue.peekFirst() == max) {
                map.put(max, map.get(max)-1);
                
                if (map.get(max) == 0) map.remove(max);
                
                queue.pollFirst();
                
                tempLocation--;
                answer++;
                
                if (tempLocation == -1) break;
            } else {
                queue.addLast(queue.pollFirst());
                
                if (tempLocation == 0) tempLocation = queue.size()-1;
                else tempLocation--;
            }
        }
        
        return answer;
    }
}
