class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        
        for (int i=0; i<lottos.length; i++) {
            
            if (lottos[i] == 0) {
                answer[0]++;
            }
            
            for (int j=0; j<win_nums.length; j++) {
                
                if (lottos[i] == win_nums[j]) {
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        
        answer[0] = getLot(answer[0]);
        answer[1] = getLot(answer[1]);
        
        return answer;
    }
    
    static int getLot(int num) {
        switch(num) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default :
                return 6;
        }
    }
}
