class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];

        /**
         * (1,1)(1,2)(1,3)
         * (2,1)(2,2)(2,3)
         * (3,1)(3,2)(3,3)
         * 
         * max(1,1)max(1,2)max(1,3) = 1 2 3
         * max(2,1)max(2,2)max(2,3) = 2 2 3
         * max(3,1)max(3,2)max(3,3) = 3 3 3
         * 
         * idx   = 0 1 2 3 4 5 6 7 8
         * value = 1 2 3 2 2 3 3 3 3
         * 
         * idx / n = 2/3 = 0 + 1 = 1
         * idx % n = 2%3 = 2 + 1 = 3
         * idx가 2면 (1,3)과 같음
         */
        /********** code 1 **********/
        for (int i=0; i<answer.length; i++) {
            answer[i] = Math.max((int) (left / n + 1), (int) (left % n + 1));
            left++;
        }
        /****************************/
        
        /* 모든 행과 열에 값을 넣으면 메모리 초과 */
        int[][] matrix = new int[n][n];
        
        for (int i=0; i<n; i++) {
            matrix[i][i] = i+1;
            
            for (int j=i+1; j<n; j++) {
                matrix[i][j] = j+1;
                matrix[j][i] = j+1;
            }
        }
        
        int[] arr = new int[n*n];
        int idx = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[idx] = matrix[i][j];
                idx++;
            }
        }
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = arr[(int)left + i];
        }
        /****************************/
        
        return answer;
    }
}
