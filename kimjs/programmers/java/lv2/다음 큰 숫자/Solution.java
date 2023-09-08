class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String bin = Integer.toBinaryString(n);
        
        int temp1 = 0, temp2 = 0;
        temp1 = bin.replaceAll("0", "").length();
        
        for (int i=n+1; i<=1000000; i++) {
            bin = Integer.toBinaryString(i);
            
            if (temp1 == bin.replaceAll("0", "").length()) {
                answer = i;
                break;
            }
        }
        
        for (int i=n+1; i<=1000000; i++) {
            if (Integer.bitCount(n) == Integer.bitCount(i)) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
