#include<stdio.h>
#include<string.h>
main(){
	char b[5];
	int i;
	strcpy(b,"helloworld");
	printf("%s\n",b );
	for(i=0;i<100;i++)
		printf("%s\n",b );
}

/*
to avoid stack smashing compile with -fno-stack-protector
*/
