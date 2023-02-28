import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();
        
        for (int i=0; i<numbers.length-1; i++) {
            
            for (int j=i+1; j<numbers.length; j++) {
                
                if (!list.contains(numbers[i] + numbers[j]))
                    list.add(numbers[i] + numbers[j]);
                
            }
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        
        for (int i=0; i<list.size(); i++) answer[i] = list.get(i);
        
        return answer;
    }
}
