#include <stdio.h>
#include <stdlib.h>

int main() {
	
	int *iSqc, iSqcLen, threshold;
	
	int *filterArr, filterCnt = 0;

	int tmp;

	scanf("%d %d", &iSqcLen, &threshold);

	iSqc = (int*)malloc(iSqcLen * sizeof(int));
	filterArr = (int*)malloc(iSqcLen * sizeof(int));

	for (int i = 0; i < iSqcLen; i++)
	{
		scanf("%d", &iSqc[i]);

		if (iSqc[i] < threshold)
		{
			filterArr[filterCnt] = i;	// iSqc의 배열 번호 저장
			filterCnt++;
		}

	}

	for (int i = 0; i < filterCnt; i++)
	{
		tmp = filterArr[i];
		printf("%d ", iSqc[tmp]);
	}

	free(iSqc);
	free(filterArr);
	return 0;
}

// 방법을 생각
// 입력이 끝나고 다시 전체 반복문 해서 출력할지
// 배열에 순차적으로 저장해서 효율적으로 다시 출력할지 OK