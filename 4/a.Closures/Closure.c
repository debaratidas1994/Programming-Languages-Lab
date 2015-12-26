#include<stdio.h>
struct callback{
	int a;
	int b;
	int (*f)(int,int);
};
void add(int a,int b){
	int sum = a+b;
	printf("%d\n",sum);
}
main(){
	struct callback param;
	param.a=10;
	param.b=20;
	param.f=add;
	fun(param);
}


void fun(struct callback param){
	param.f(param.a,param.b);
}