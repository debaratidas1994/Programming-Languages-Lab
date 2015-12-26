#include<stdio.h>
main(){
	int a;
	a=factorial(6);
	printf("%d",a);
}

int factorial(int n){
	int a;
	a=factorial1(n,1);
	return a;
}

int factorial1(int n, int a){
	if(n==0)
		return a;
	else
		return factorial1(n-1,n*a);
}