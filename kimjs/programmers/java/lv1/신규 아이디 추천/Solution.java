class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1
        answer = new_id.toLowerCase();
        
        // 2
        answer = answer.replaceAll("[^a-z0-9-_.]", "");
        
        // 3
        answer = answer.replaceAll("\\.{2,}", ".");
        
        // 4
        answer = answer.replaceAll("^[.]|[.]$", "");
        
        // 5
        answer = answer.isEmpty() ? "a" : answer;
        
        // 6
        answer = answer.length() >= 16 ? answer.substring(0, 15) : answer;
        answer = answer.replaceAll("[.]$", "");
        
        // 7
        char ch = answer.charAt(answer.length()-1);
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += ch;
            }
        }
        
        return answer;
    }
}
