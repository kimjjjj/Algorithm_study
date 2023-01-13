class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
            
        } else {
            int[] answer = new int[arr.length - 1];
            int minVal = arr[0], minIdx = 0, idx = 0;

            for (int i=1; i<arr.length; i++) {
                if (minVal > arr[i]) {
                    minVal = arr[i];
                    minIdx = i;
                }
            }

            for (int i=0; i<arr.length; i++) {
                if (minIdx != i) {
                    answer[idx] = arr[i];
                    idx++;
                }
            }
            
            return answer;
        }
    }
}
