class Solution {
    public double solution(int[] arr) {
	int sumInt = 0;
	double answer = 0;
	
	// 합 계산
	for(int i=0; i<arr.length; i++) {
	    sumInt += arr[i];
	}
	
	// 평균 계산
	answer = (double) sumInt / arr.length;
	
	return answer;
    }
}
