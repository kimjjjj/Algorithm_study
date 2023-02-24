import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        Arrays.sort(strings);
        
        int cnt = 0;
        
        for (int i=97; i<=122; i++) {
            
            for (int j=0; j<strings.length; j++) {
                
                if (i == strings[j].charAt(n)) {
                    
                    answer[cnt] = strings[j];
                    cnt++;
                    
                }
            }
        }
        
        return answer;
    }
}
