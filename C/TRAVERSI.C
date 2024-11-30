#include<stdio.h>
#include<conio.h>
void main()
{
	int i,n ;
	int array[] = { 1, 2, 3 , 4, 5, 6};
	clrscr();
	n = sizeof(array) / sizeof(array[0]);
	for(i=0; i<n;i++)
	{
		printf("%d	", array[i]);
	}
	getch();
}
