#include<stdio.h>
main(){
	int a=10;
	goto l; //forward jump
	if(a==10)
		l1:
		printf("yolo");
	l:
	printf("not yolo");
	//goto l1; //backward jump	
}