import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        
        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);
        
        for (int i=0; i<choices.length; i++) {
            
            if (choices[i] >= 1 && choices[i] <= 3) {
                
                String str = survey[i].substring(0, 1);
                
                int num = map.get(str) + Math.abs(choices[i] - 4);
                map.put(str, num);
                
            } else if (choices[i] >= 5 && choices[i] <= 7) {
                
                String str = survey[i].substring(1, 2);
                
                int num = map.get(str) + Math.abs(choices[i] - 4);
                map.put(str, num);
            }
        }
        
        if (map.get("R") >= map.get("T")) {
            answer += "R";
            
        } else {
            answer += "T";
        }
        
        if (map.get("C") >= map.get("F")) {
            answer += "C";
            
        } else {
            answer += "F";
        }
        
        if (map.get("J") >= map.get("M")) {
            answer += "J";
            
        } else {
            answer += "M";
        }
        
        if (map.get("A") >= map.get("N")) {
            answer += "A";
            
        } else {
            answer += "N";
        }
        
        return answer;
    }
}
