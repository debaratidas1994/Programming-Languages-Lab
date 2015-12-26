#include<stdio.h>
int main(){
	extern z;
	printf("value of z is %d",z);
}

//Conclusion: A static variable cannot be externed. 