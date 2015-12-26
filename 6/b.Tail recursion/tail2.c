#include<stdio.h>
void reverse(char * ,int ,int);
main(){
	char a[10]="aravind";
	reverse(a,0,6);
	printf("%s",a);
}

void reverse(char *s, int i, int j){
	char temp;
	if(i<j){
		temp=s[i];
		s[i]=s[j];
		s[j]=temp;
		reverse(s,i+1,j-1);
	}
}