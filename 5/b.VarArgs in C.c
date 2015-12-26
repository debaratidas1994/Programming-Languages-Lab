#include<stdio.h>
#include<stdarg.h>
void fn(int,...);
main(){
	fn(3,1,2,3);
	fn(1,99);
}

void fn(int count,...){
	va_list a;
	va_start(a,count);
	int i;
	for(i=0;i<count;i++){
		printf("%d\n",va_arg(a,int));
	}
	va_end(a);
}