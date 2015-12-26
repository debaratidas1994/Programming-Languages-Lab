#include<stdio.h>
main(){
	int c=10;
	func();
	v:
	printf("%d \n",c);
}

func(){
	goto v; //error: label v used but not defined
}

/* 
Conclusion: The scope of goto is only within a function
*/