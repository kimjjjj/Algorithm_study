import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();

        /********** code 1 **********/
        for (int i=1; i<=elements.length; i++) {
            
            for (int j=0; j<elements.length; j++) {
                
                int sum = 0;
                int cnt = 0;
                int idx = j;
                
                while (cnt < i) {
                    sum += elements[idx];
                    idx++;
                    cnt++;
                    
                    if (cnt == i) {
                        idx -= (i-1);
                        set.add(sum);
                    }
                    
                    if (idx == elements.length) {
                        idx = 0;
                    }
                }
            }
        }
        /****************************/

        /********** code 2 **********/
        int[] arr = new int[elements.length];
        
        for (int i=1; i<=elements.length; i++) {
            
            for (int j=0; j<elements.length; j++) {
                arr[j] += elements[(i+j-1) % elements.length];
                set.add(arr[j]);
            }
        }
        /****************************/
        
        answer = set.size();
        
        return answer;
    }
}
