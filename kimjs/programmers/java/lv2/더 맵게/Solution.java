import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> priQueue = new PriorityQueue<>();
        
        for (int i : scoville) priQueue.add(i);
        
        while(priQueue.peek() < K) {

            if (priQueue.size() == 1)  return -1;

            priQueue.add(priQueue.poll() + priQueue.poll() * 2);

            answer++;
        }
        
        return answer;
    }
}
