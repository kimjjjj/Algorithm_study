import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        Map<String, Integer> temp = new HashMap<>(map);
        
        int idx = 0;
        while (idx <= discount.length-10) {
            for (int i=idx; i<idx+10; i++) {
                if (temp.containsKey(discount[i])) {
                    temp.put(discount[i], temp.get(discount[i])-1);
                    
                    if (temp.get(discount[i]) == 0) {
                        temp.remove(discount[i]);
                    }
                }
            }
            
            idx++;
            
            if (temp.isEmpty()) {
                answer++;
            }
            
            temp = new HashMap<>(map);
        }
        
        return answer;
    }
}
