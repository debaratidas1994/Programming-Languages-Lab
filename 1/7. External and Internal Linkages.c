#include<stdio.h>
int *test();
//returning a pointer to static variable
main(){
	int *p;
	p=test();
	printf("in main %d \n",*p);

}

int *test(){
	static int c=0;
	c+=10;
	printf("in test %d \n",c);
	return &c;
}