import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String[] strArr = dartResult.split("");
        
        List<Integer> list = new ArrayList<>();
        
        String temp = "";
        
        for (int i=0; i<dartResult.length(); i++) {
            
            if ("S".equals(strArr[i])) {
                list.add((int) Math.pow(Integer.parseInt(temp), 1));
                temp = "";
                
            } else if ("D".equals(strArr[i])) {
                list.add((int) Math.pow(Integer.parseInt(temp), 2));
                temp = "";
                
            } else if ("T".equals(strArr[i])) {
                list.add((int) Math.pow(Integer.parseInt(temp), 3));
                temp = "";
                
            } else if ("#".equals(strArr[i])) {
                list.set(list.size()-1, list.get(list.size()-1) * -1);
                
            } else if ("*".equals(strArr[i])) {
                list.set(list.size()-1, list.get(list.size()-1) * 2);
                
                if (list.size() > 1) {
                    list.set(list.size()-2, list.get(list.size()-2) * 2);
                }
            } else {
                temp += strArr[i];
            }
        }
        
        for (int i=0; i<list.size(); i++) {
            answer += list.get(i);
        }
        
        return answer;
    }
}
