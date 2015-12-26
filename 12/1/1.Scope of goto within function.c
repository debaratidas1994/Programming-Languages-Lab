#include<stdio.h>
main(){
	int c=10;
	func();
	printf("%d \n",c);
}

func(){
	goto v;
	v: 
	printf("hello");
}

/* 
Conclusion: The scope of goto is only within a function
*/