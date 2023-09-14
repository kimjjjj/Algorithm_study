import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i=people.length-1; i>=0; i--) {
            deque.offer(people[i]);
        }
        
        int count = 0;
        while (!deque.isEmpty()) {
            
            int sum = deque.peekFirst() + deque.peekLast();
            
            if (sum > limit) {
                deque.pollFirst();
                count++;
            } else {
                deque.pollFirst();
                deque.pollLast();
                count++;
            }
            
            if (!deque.isEmpty()) {
                if (deque.peekLast() > Math.ceil((double) limit/2) ) {
                    break;
                }
            }
        }
        
        if(!deque.isEmpty()) {
            count += deque.size();
        }
        
        answer = count;
        
        return answer;
    }
}
