import java.util.*;

class Solution {
    
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        int n = maps.length, m = maps[0].length;
        
        int[][] visited = new int[n][m];
        
        move(maps, visited, n, m);
        
        answer = visited[n-1][m-1];
        
        if(answer == 0) answer = -1;
        
        return answer;
    }
    
    static void move(int[][] maps, int[][] visited, int n, int m) {
        
        int x = 0, y = 0;
        
        visited[x][y] = 1;
        
        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(new int[] {x, y});
        
        while (!queue.isEmpty()) {
            int[] current = queue.remove();
            
            int cx = current[0];
            int cy = current[1];
            
            for (int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                if (nx < 0 || nx > n-1 || ny < 0 || ny > m-1) continue;
                
                if (visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                    visited[nx][ny] = visited[cx][cy] + 1;
                    
                    queue.add(new int[] {nx, ny});
                }
            }
        }
    }
}
