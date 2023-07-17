import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        int[] arrTemp = new int[10];
        
        for (int i=0; i<X.length(); i++) {
            arrX[X.charAt(i) - 48]++;
        }
        
        for (int i=0; i<Y.length(); i++) {
            arrY[Y.charAt(i) - 48]++;
        }
        
        for (int i=0; i<10; i++) {
            
            if (arrX[i] > 0 && arrY[i] > 0) {
                arrTemp[i] = Math.min(arrX[i], arrY[i]);
            }
        }
        
        for (int i=arrTemp.length-1; i>=0; i--) {
            
            if (arrTemp[i] > 0) {
                
                for (int j=0; j<arrTemp[i]; j++) {
                    answer.append(i);
                }
            }
        }
        
        if (answer.toString().isEmpty()) {
            return "-1";
            
        } else if (answer.charAt(0) - 48 == 0 && answer.charAt(answer.length()-1) - 48 == 0) {
            return "0";
            
        } else {
            return answer.toString();
            
        }
    }
}
