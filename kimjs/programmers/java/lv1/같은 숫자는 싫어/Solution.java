public class Solution {
    public int[] solution(int []arr) {
        int[] tempArr = new int[arr.length];
        tempArr[0] = arr[0];
        
        for (int i=1; i<tempArr.length; i++) tempArr[i] = -1;
        
        for (int i=1; i<arr.length; i++) {
            if (arr[i-1] != arr[i]) tempArr[i] = arr[i];
        }
        
        int cnt = 0;
        for (int i=0; i<tempArr.length; i++) {
            if (tempArr[i] != -1) cnt++;
        }
        
        int[] answer = new int[cnt];
        
        cnt = 0;
        for (int i=0; i<tempArr.length; i++) {
            if (tempArr[i] != -1) {
                answer[cnt] = tempArr[i];
                cnt++;
            }
        }

        return answer;
    }
}
