class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        
        /******** code 1 ********/
        String s = String.valueOf(x);
        
        for (int i=0; i<s.length(); i++) sum += s.charAt(i) - '0';
        /************************/
        
        /******** code 2 ********/
        char[] array = String.valueOf(x).toCharArray();
        
        for (int i=0; i<array.length; i++) sum += array[i] - '0';
        /************************/
        
        if (x % sum == 0) answer = true;
        else answer = false;
        
        return answer;
    }
}
