import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        
        for (String city : cities) {
            
            city = city.toUpperCase();
            
            if (!list.isEmpty()) {
                
                if (list.contains(city)) {
                    answer += 1;
                    list.remove(list.indexOf(city));
                } else {
                    
                    answer += 5;
                    
                    if (list.size() >= cacheSize) {
                        list.remove(0);
                    }
                }
            } else {
                answer += 5;
            }
            
            if (cacheSize != 0) {
                list.add(city);
            }
        }
        
        return answer;
    }
}
