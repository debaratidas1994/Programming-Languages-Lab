#include<stdio.h>
#include<stdlib.h>

int main()
{
	int *p = (int *)malloc(sizeof(int));
	int *q = (int *)malloc(sizeof(int));
	*p = 10;
	return 0;
}
