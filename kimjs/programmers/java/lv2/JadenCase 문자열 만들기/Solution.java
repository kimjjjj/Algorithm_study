import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();

        /********** code 1 **********/
        s = s.toLowerCase();
        
        for (int i=0; i<s.length(); i++) {
            
            if (i > 0) {
                if (s.charAt(i-1) == 32 && s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                    sb.append((char) (s.charAt(i)-32));
                } else {
                    sb.append(s.charAt(i));
                }
            } else {
                if (s.charAt(0) >= 97 && s.charAt(0) <= 122) {
                    sb.append((char) (s.charAt(0)-32));
                } else if (s.charAt(0) >= 48 && s.charAt(0) <= 57) {
                    sb.append(s.charAt(0));
                }
            }
        }
        /****************************/

        /********** code 2 **********/
        String[] arr = s.toLowerCase().split("");
        
        boolean chk = true;
        
        for (String str : arr) {
            
            sb.append(chk ? str.toUpperCase() : str);
            
            chk = " ".equals(str) ? true : false;
        }
        /****************************/
        
        return sb.toString();
    }
}
