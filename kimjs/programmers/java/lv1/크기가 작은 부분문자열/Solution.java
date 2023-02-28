class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        long[] arr = new long[t.length() - p.length() + 1];
        
        int start = 0, end = p.length();
        long temp = Long.parseLong(p);
        
        for(int i=0; i<t.length() - p.length() + 1; i++) {
            
            if (Long.parseLong(t.substring(start, end)) <= temp) answer++;
            
            start++;
            end++;
            
        }
        
        return answer;
    }
}
