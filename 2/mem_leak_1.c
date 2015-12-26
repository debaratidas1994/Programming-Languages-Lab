#include<mcheck.h> /****/
#include<stdlib.h>

int main()
{
	mtrace(); /****/
	int *p=(int *)malloc(sizeof(int));
	*p = 10;
	muntrace(); /****/
}
