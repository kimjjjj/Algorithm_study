#include <stdio.h>

int main() {

	int input, a, b;

	scanf("%d", &input);

	for (int i = 0; i < input; i++)
	{
		scanf("%d %d", &a, &b);
		printf("Case #%d: %d\n", i + 1, a + b);
	}
	
	return 0;
}