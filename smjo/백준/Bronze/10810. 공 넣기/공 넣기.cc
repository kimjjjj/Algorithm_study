#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {

	int iBasket_TotalCnt, iBall_TotalPutCnt;
	int iBasket_StrPos, iBasket_EndPos, iBall_InputNum;
	int *iBasket;

	scanf("%d %d", &iBasket_TotalCnt, &iBall_TotalPutCnt);

	iBasket = (int*)malloc(iBasket_TotalCnt * sizeof(int));
	memset(iBasket, 0, sizeof(iBasket));

	for (int i = 0; i < iBall_TotalPutCnt; i++)
	{
		scanf("%d %d %d", &iBasket_StrPos, &iBasket_EndPos, &iBall_InputNum);

		for (int j = iBasket_StrPos; j <= iBasket_EndPos; j++)
		{
			iBasket[j - 1] = iBall_InputNum;
		}
	}

	for (int i = 0; i < iBasket_TotalCnt; i++)
	{
		printf("%d ", iBasket[i]);
	}

	free(iBasket);

}

// 방법을 생각
// 동적배열선언 초기화 반복문안에서 변경