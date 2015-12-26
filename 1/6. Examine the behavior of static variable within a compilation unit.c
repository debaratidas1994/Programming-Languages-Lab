#include<stdio.h>
main(){
	int a=10;
	if(a>0){
		static int b=10;
		printf("Value of b within compilation unit= %d",b);
	}
	//printf("Value of b outside compilation unit= %d",b);
}

/*
Conclusion: The scope of static variable declared within a compilation unit is within
that unit only. Outside the loop the static variable is inaccessible. 
*/