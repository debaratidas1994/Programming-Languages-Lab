#include<stdio.h>
struct emp
{
	char name[10];
	int eid;
	float salary;
};
struct employee
{
	char name[10];
	int eid;
	float salary;
};

typedef int myint;
int main()
{
	struct emp e1={"lisa",23,2000};
	struct employee e2={"lisa",23,2000};
	struct emp e3 = e1;
	int i=9;
	myint i2=9;
	if(i==i2)
		printf("compatible\n");
	printf("%d\n",e3.eid);
	return 0;
}
