import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        
        String wordChk = words[0].substring(words[0].length()-1);
        int human = 2, cnt = 1;
        
        for (int i=1; i<words.length; i++) {
            
            if (!wordChk.equals(words[i].substring(0, 1))) {
                answer[0] = human;
                answer[1] = cnt;
                break;
            } else {
                wordChk = words[i].substring(words[i].length()-1);
            }
            
            if (!set.contains(words[i])) {
                set.add(words[i]);
                
                if (human < n) {
                    human++;
                } else {
                    human = 1;
                    cnt++;
                }
            } else {
                answer[0] = human;
                answer[1] = cnt;
                break;
            }
        }

        return answer;
    }
}
