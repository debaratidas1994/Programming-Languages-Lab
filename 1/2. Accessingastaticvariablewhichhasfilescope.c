#include<stdio.h>
void test();
static int count=0;
main(){
	test();
	printf("%d\n",count);
}

test(){
	count++;
	printf("%d\n",count);
}

/*
Conclusion: A static variable defined within the file scope 
can be accessed across functions in the same file. 
*/