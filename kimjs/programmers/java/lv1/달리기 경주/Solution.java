import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String calling : callings) {
            int value = map.get(calling);
            String prePlayer = players[value-1];
            
            players[value-1] = calling;
            map.put(calling, value-1);
            
            players[value] = prePlayer;
            map.put(prePlayer, value);
        }
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = players[i];
        }
        
        return answer;
    }
}
