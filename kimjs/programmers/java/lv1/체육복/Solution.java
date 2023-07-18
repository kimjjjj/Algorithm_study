import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int[] numArr = new int[n];
        
        for (int i=0; i<n; i++) {
            numArr[i] = 1;
        }
        
        for (int i=0; i<reserve.length; i++) {
            numArr[reserve[i]-1]++;
        }
        
        for (int i=0; i<lost.length; i++) {
            numArr[lost[i]-1]--;
        }
        
        for (int i=0; i<reserve.length; i++) {
            if (numArr[reserve[i]-1] > 1) {
                if (reserve[i] == 1) {
                
                    numArr[reserve[i]-1]--;
                    numArr[reserve[i]]++;
                
                } else if (reserve[i] > 1 && reserve[i] < n) {
                
                    if (numArr[reserve[i]-2] == 0) {//이전
                    
                        numArr[reserve[i]-1]--;
                        numArr[reserve[i]-2]++;
                    
                    } else if (numArr[reserve[i]] == 0) {//이후
                    
                        numArr[reserve[i]-1]--;
                        numArr[reserve[i]]++;
                    
                    }
                } else if (reserve[i] == n) {
                
                    numArr[reserve[i]-1]--;
                    numArr[reserve[i]-2]++;
                }
            }
        }
        
        for (int i=0; i<numArr.length; i++) {
            if (numArr[i] > 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
