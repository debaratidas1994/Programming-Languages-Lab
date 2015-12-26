#include<setjmp.h>
#include<stdio.h>
jmp_buf a;
main(){
	int i;
	i=setjmp(a);
	if(i==0){
		test();
		printf("This will not be printed \n");
	}
	printf("%d\n",i );
}

test(){
	longjmp(a,10);
}