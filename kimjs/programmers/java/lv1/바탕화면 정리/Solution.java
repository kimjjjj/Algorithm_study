class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {0, 0, 0, 0};
        
        int minx = 51, miny = 51, maxx = 0, maxy = 0;
        for (int i=0; i<wallpaper.length; i++) {
            
            for (int j=0; j<wallpaper[i].length(); j++) {
                
                if (wallpaper[i].charAt(j) == '#') {
                    
                    minx = Math.min(i, minx);
                    miny = Math.min(j, miny);
                    maxx = Math.max(i, maxx);
                    maxy = Math.max(j, maxy);
                }
            }
        }
        
        answer[0] = minx;
        answer[1] = miny;
        answer[2] = maxx+1;
        answer[3] = maxy+1;
        
        return answer;
    }
}
