class Solution {
    public int solution(int[] numbers) {
        /********** code 1 **********/
        int answer = 0;
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for (int i=0; i<numbers.length; i++) array[numbers[i]] = -1;
        
        for (int i=0; i<array.length; i++) if (array[i] != -1) answer += array[i];
        /****************************/
        
        /********** code 2 **********/
        int answer = 45;
        
        for (int i : numbers) answer -= i;
        /****************************/
        
        return answer;
    }
}
