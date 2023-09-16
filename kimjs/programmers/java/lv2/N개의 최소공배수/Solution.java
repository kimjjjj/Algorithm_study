class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int idx = arr[0];
        
        for (int i=0; i<arr.length-1; i++) {
            idx = idx * arr[i+1] / med(Math.max(idx, arr[i+1]), Math.min(idx, arr[i+1]));
        }
        
        return answer = idx;
    }
    
    static int med(int a, int b) {
        if (b == 0) return a;
        return med(b, a%b);
    }
}
