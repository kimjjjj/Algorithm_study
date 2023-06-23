class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        answer[0] = -1;
        
        String[] arr = s.split("");
        
        for (int i=1; i<len; i++) {
            for (int j=i-1; j>=0; j--) {
                
                if (arr[j].equals(arr[i])) {
                    answer[i] = i-j;
                    break;
                } else {
                    answer[i] = -1;
                }
            }
        }
        
        return answer;
    }
}
