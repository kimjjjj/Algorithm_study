import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};
        
        int x = 0, y = 0, maxX = park.length-1, maxY = 0;
        for (int i=0; i<park.length; i++) {
            
            for (int j=0; j<park[i].length(); j++) {
                maxY = park[i].length()-1;
                
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        
        Map<String, int[]> map = new HashMap<>();
        map.put("N", new int[] {-1, 0}); // N
        map.put("E", new int[] {0, 1}); // E
        map.put("W", new int[] {0, -1}); // W
        map.put("S", new int[] {1, 0}); // S
        
        for (String route : routes) {
            route = route.replace(" ", "");
            
            String way = route.substring(0, 1);
            int move = Integer.parseInt(route.substring(1, route.length()));
            
            int[] step = map.get(way);
            int tempX = x, tempY = y;
            
            for (int i=0; i<move; i++) {
                
                if (tempX + step[0] < 0 || tempX + step[0] > maxX || tempY + step[1] < 0 || tempY + step[1] > maxY || park[tempX + step[0]].charAt(tempY + step[1]) == 'X') {
                    tempX = x;
                    tempY = y;
                    break;
                } else {
                    tempX += step[0];
                    tempY += step[1];
                }
            }
            
            x = tempX;
            y = tempY;
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}
