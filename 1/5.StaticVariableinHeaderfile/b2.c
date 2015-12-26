#include<stdio.h>
#include "a.h"
main(){
	a=a+10;
	printf("%d",a);
}

/*
Conclusion: When a .h file containing a static variable is included in the several .c files, 
a new memory is allocated for that variable for that particular file, which means that different 
files will use their respective copies of the static variable during the program execution.   
*/