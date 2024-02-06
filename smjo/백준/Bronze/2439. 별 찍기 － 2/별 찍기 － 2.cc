#include <stdio.h>

int main() {

	int input, a, b;

	scanf("%d", &input);

	if (!(input >= 1 && input <= 100))
		return 0;

	for (int floor = 0; floor < input; floor++)
	{
		for (int i = 0; i < (input - floor - 1); i++)
		{
			printf(" ");
		}
		for (int count = 0; count <= floor; count++)
		{
			printf("*");
		}
		printf("\n");
	}

	return 0;
}