#include <stdio.h>

#define NUM_CNT 9

int main() {

	int iNumArr[NUM_CNT], iMaxIndex, iMaxNum = 0;

	for (int i = 0; i < NUM_CNT; i++)
	{
		scanf("%d", &iNumArr[i]);

		if (iNumArr[i] > iMaxNum)
		{
			iMaxNum = iNumArr[i];
			iMaxIndex = i + 1;
		}
	}

	printf("%d\n%d", iMaxNum, iMaxIndex);

	return 0;
}

// 방법을 생각
// NUM_CNT 값을 이용해 재사용하기 쉽도록
// index 개념으로 사용하기?