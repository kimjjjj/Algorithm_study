class Solution {
    public String solution(int num) {
        String answer = "";
        
        if((num & 1) != 0) {
            answer = "Odd";
        } else {
            answer = "Even";
        }
        
        return answer;
    }
}
