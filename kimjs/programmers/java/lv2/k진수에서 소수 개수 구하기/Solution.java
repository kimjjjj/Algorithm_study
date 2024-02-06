import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String str = Integer.toString(n, k);
        
        int start = 0, end = str.indexOf("0");
        while (start < str.length()) {
            if (end == -1) {
                end = str.length();
            }
            
            if (start != end) {
                double num = Double.parseDouble(str.substring(start, end));
                
                if (num > 1) answer += isPrime(num);
            }
            
            start = end+1;
            end = str.indexOf("0", end+1);
        }
        
        String[] strArr = str.split("0");
        
        for(String s : strArr) {
            if (!s.isEmpty()) {
                double num = Double.parseDouble(s);
                
                if (num > 1) {
                    answer += isPrime(num);
                }
            }
        }
        
        return answer;
    }
    
    static int isPrime(double num) {
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0) return 0;
        }
        
        return 1;
    }
}
