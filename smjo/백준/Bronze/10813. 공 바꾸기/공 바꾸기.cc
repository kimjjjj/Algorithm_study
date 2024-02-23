#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {

	int basketCnt, swapCnt;
	int *iBaskets, first_B, second_B, tmp;

	scanf("%d %d", &basketCnt, &swapCnt);

	iBaskets = (int*)malloc(basketCnt * sizeof(int));

	for (int i = 0; i < basketCnt; i++)
	{
		iBaskets[i] = i + 1;
	}

	for (int i = 0; i < swapCnt; i++)
	{
		scanf("%d %d", &first_B, &second_B);
		tmp = iBaskets[first_B - 1];
		iBaskets[first_B - 1] = iBaskets[second_B - 1];
		iBaskets[second_B - 1] = tmp;
	}

	for (int i = 0; i < basketCnt; i++)
	{
		printf("%d ", iBaskets[i]);
	}
}