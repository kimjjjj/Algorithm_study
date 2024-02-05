class Solution {
    /********** code 1 **********/
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        boolean[] visited = new boolean[numbers.length];
        
        dfs(numbers, target, visited, 0);
        
        return answer;
    }
    
    static void dfs(int[] numbers, int target, boolean[] visited, int index) {
        if (index == numbers.length) {
            
            int cal = 0;
            for (int i=0; i<numbers.length; i++) {
                
                if (visited[i])
                    cal += numbers[i];
                else
                    cal -= numbers[i];
            }
            
            if (cal == target) answer++;
            
            return;
        }
        
        visited[index] = true;
        dfs(numbers, target, visited, index+1);
        
        visited[index] = false;
        dfs(numbers, target, visited, index+1);
    }
    /****************************/

    /********** code 2 **********/
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        answer = dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    static int dfs(int[] numbers, int target, int index, int sum) {
        int cnt = 0;
        
        if (numbers.length == index) {
            if (sum == target) {
                return 1;
            }
            
            return 0;
        }
        
        cnt += dfs(numbers, target, index+1, sum + numbers[index]);
        cnt += dfs(numbers, target, index+1, sum + numbers[index]*(-1));
        
        return cnt;
    }
    /****************************/
}
