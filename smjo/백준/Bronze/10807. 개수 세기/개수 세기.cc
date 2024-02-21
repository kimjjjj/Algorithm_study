#include <stdio.h>
#include <stdlib.h>

int main() {
	
	int iArrNum, indexof, count = 0;
	int *arr;

	scanf("%d", &iArrNum);

	arr = (int*)malloc(iArrNum * sizeof(int));

	for (int i = 0; i < iArrNum; i++)
	{
		scanf("%d", &arr[i]);
	}

	scanf("%d", &indexof);

	for (int i = 0; i < iArrNum; i++)
	{
		if (arr[i] == indexof)
		{
			count++;
		}
	}

	printf("%d", count);

	free(arr);
	return 0;
}
