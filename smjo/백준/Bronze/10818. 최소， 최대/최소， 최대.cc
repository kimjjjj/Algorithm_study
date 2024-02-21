#include <stdio.h>
#include <stdlib.h>

#define MAX_RANGE 1000000
#define MIN_RANGE -1000000

int main() {

	int numCnt, minVal, maxVal;
	int InputNum;

	minVal = MAX_RANGE; // 최대값으로 초기화 후 작은수 나오면 값 변경
	maxVal = MIN_RANGE;	// 최소값으로 초기화 후 큰수 나오면 값 변경

	scanf("%d", &numCnt);

	
	for (int i = 0; i < numCnt; i++)
	{
		scanf("%d", &InputNum);

		if (InputNum > maxVal)
			maxVal = InputNum;

		if (InputNum < minVal)
			minVal = InputNum;
	}

	printf("%d %d", minVal, maxVal);

	return 0;
}

// 방법을 생각
// 입력 모두 받고 계산하기
// 입력 받자마자 조건을 통한 판단하기 OK