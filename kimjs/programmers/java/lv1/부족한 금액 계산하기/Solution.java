class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sumPrice = 0;
        
        for (int i=1; i<=count; i++) sumPrice += (price * i);
        
        if (sumPrice - money <= 0) answer = 0;
        else answer = sumPrice - money;

        return answer;
    }
}
