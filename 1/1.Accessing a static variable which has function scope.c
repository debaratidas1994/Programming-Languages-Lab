#include<stdio.h>
void test(void);
main(){
	test();
	printf("%d",count)
}

void test(){
	static int count=0;
	count++;
	printf("%d",count);
}

/*
Conclusion: A static variable defined within a function scope cannot be referred from 
another function in the same file
*/