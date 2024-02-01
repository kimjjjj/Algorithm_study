class Solution {
    static int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        // 방문 체크용
        boolean[] visited = new boolean[dungeons.length];
        
        dfs(dungeons, visited, k);
        
        return answer;
    }
    
    public static void dfs(int[][] dungeons, boolean[] visited, int hp) {
        
        // 방문 체크용 visited에 ture면 count
        int tempAnswer = 0;
        for (int i=0; i<dungeons.length; i++) if (visited[i]) tempAnswer++;
        
        if (answer < tempAnswer) answer = tempAnswer;
        
        for (int i=0; i<dungeons.length; i++) {
            if (!visited[i]) {
                if (hp >= dungeons[i][0]) {
                    hp -= dungeons[i][1];
                    visited[i] = true;
                    
                    dfs(dungeons, visited, hp);
                    
                    hp += dungeons[i][1];
                    visited[i] = false;
                }
            }
        }
    }
}
