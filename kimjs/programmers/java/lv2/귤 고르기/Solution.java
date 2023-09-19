import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        /********** code 1 **********/
        int[] arr = new int[10000000];
        
        for (int i=0; i<tangerine.length; i++) {
            arr[tangerine[i]-1]++;
        }
        
        Arrays.sort(arr);
        
        int sum = 0;
        for (int i=arr.length-1; i>=0; i--) {
            
            if (arr[i] > 0) {
                sum += arr[i];
                answer++;
                
                if (sum >= k) {
                    break;
                }
            }
        }
        /****************************/

        /********** code 2 **********/
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        
        list.sort((o1, o2) -> map.get(o2)-map.get(o1));
        
        int sum = 0;
        for (Integer num : list) {
            if (map.get(num) > 0) {
                sum += map.get(num);
                answer++;
                
                if (sum >= k) {
                    break;
                }
            }
        }
        /****************************/
        
        return answer;
    }
}
