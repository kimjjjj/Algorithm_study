import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, HashSet<String>> hashMap = new HashMap<>();
        HashMap<String, Integer> idMap = new HashMap<>();
        
        for(int i=0; i<id_list.length; i++){
            hashMap.put(id_list[i], new HashSet<>());
            
            idMap.put(id_list[i], i);
        }
        
        for(String r : report){
            String[] str = r.split(" ");
            hashMap.get(str[1]).add(str[0]);
        }
        
        for (int i=0; i<id_list.length; i++) {
            
            HashSet<String> set = hashMap.get(id_list[i]);
            
            if (set.size() >= k) {
                
                for (String userId : set) {
                    answer[idMap.get(userId)]++;
                }
            }
        }
        
        return answer;
    }
}
