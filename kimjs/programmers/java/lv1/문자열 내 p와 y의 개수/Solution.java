class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        /****** code 1 ******/
        int sumP = 0, sumY = 0;
        
        char[] array = String.valueOf(s).toCharArray();
        
        for (int i=0; i<array.length; i++) {
            if (array[i] == 'p' || array[i] == 'P') sumP += 1;
            
            if (array[i] == 'y' || array[i] == 'Y') sumY += 1;
        }
        
        if (sumP == sumY) answer = true;
        else answer = false;
        /********************/
        
        /****** code 2 ******/
        s = s.toLowerCase();
        int count = 0;
        
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'p') count++;
            
            if (s.charAt(i) == 'y') count--;
        }
        
        if (count == 0) answer = true;
        else answer = false;
        /********************/
        
        return answer;
    }
}
