class Solution {
    public int solution(int n) {
        int answer = 0;

        /********** code 1 **********/
        int sum = 0, temp = 1;
        while (temp <= n) {
            for (int i=temp; i<=n; i++) {
                sum += i;
                
                if (sum > n) {
                    break;
                } else if (sum == n) {
                    answer++;
                }
            }
            
            temp++;
            sum = 0;
        }
        /****************************/
        
        /********** code 2 **********/
        // 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다.
        for (int i=1; i<=n; i+=2) {
            answer = n % i == 0 ? answer+1 : answer;
        }
        /****************************/
        
        return answer;
    }
}
