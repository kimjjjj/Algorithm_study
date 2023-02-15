class Solution {
    public int solution(int n) {
        String decN = Integer.toString(n, 3);
        
        String decNRev = new StringBuilder(decN).reverse().toString();
        
        int answer = Integer.parseInt(decNRev, 3);
        
        return answer;
    }
}
