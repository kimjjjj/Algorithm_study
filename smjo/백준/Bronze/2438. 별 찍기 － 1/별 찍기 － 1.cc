#include <stdio.h>

int main() {

	int input, a, b;

	scanf("%d", &input);

	for (int floor = 0; floor < input; floor++)
	{
		for (int count = 0; count <= floor; count++)
		{
			printf("*");
		}
		printf("\n");
	}

	return 0;
}