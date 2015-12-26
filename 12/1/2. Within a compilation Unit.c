#include<stdio.h>
// JUMPING INTO AND OUT OF A BLOCK
main(){
	int a=20;
	goto l;
	if(a<10){
		l:
		a=a+10;
		printf("%d\n",a);
	}
}

/*
Conclusion: It is possible to jump into and out of a block using goto avoiding conditional execution.  
*/