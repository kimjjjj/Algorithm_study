import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ");

        /********** code 1 **********/
        int min = 1000000, max = -1000000;
        for (String str : arr) {
            
            int num = Integer.parseInt(str);
            
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        answer = min + " " + max;
        /****************************/

        /********** code 2 **********/
        int[] array = new int[arr.length];
        
        for (int i=0; i<arr.length; i++) {
            array[i] = Integer.parseInt(arr[i]);
        }
        
        StringBuffer sb = new StringBuffer();
        sb.append(Arrays.stream(array).min().getAsInt());
        sb.append(" ");
        sb.append(Arrays.stream(array).max().getAsInt());
        /****************************/
        
        return sb.toString();
    }
}
