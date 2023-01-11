class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        /********** code 1 **********/
        int strLen = phone_number.length();
        
        for (int i=1; i<=strLen-4; i++) {
            answer += "*";
        }
        
        answer += phone_number.substring(strLen-4, strLen);
        /****************************/
        
        /********** code 2 **********/
        char[] array = phone_number.toCharArray();
        
        for (int i=0; i<array.length-4; i++) {
            array[i] = '*';
        }
        
        answer = String.valueOf(array);
        /****************************/
        
        return answer;
    }
}
