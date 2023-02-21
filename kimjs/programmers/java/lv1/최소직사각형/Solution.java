import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        /********** code 1 **********/
        int width = Arrays.stream(sizes[0]).max().getAsInt();
        int height = Arrays.stream(sizes[0]).min().getAsInt();
        
        for (int i=1; i<sizes.length; i++) {
            if (width < Arrays.stream(sizes[i]).max().getAsInt()) width = Arrays.stream(sizes[i]).max().getAsInt();
            if (height < Arrays.stream(sizes[i]).min().getAsInt()) height = Arrays.stream(sizes[i]).min().getAsInt();
        }
        /****************************/
        
        /********** code 2 **********/
        int width = 0;
        int height = 0;
    
        for (int[] card : sizes) {
            if (width < Math.max(card[0], card[1])) width = Math.max(card[0], card[1]);
            
            if (height < Math.min(card[0], card[1])) height = Math.min(card[0], card[1]);
        }
        /****************************/
        
        answer = width * height;
        
        return answer;
    }
}
