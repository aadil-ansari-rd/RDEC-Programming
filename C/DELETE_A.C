#include<stdio.h>
#include<conio.h>
void main()
{
	int i,m, n;
	int array[] = { 1,2,3,4,5};
	clrscr();
	printf("Enter the index on which you want to delete data");
	scanf("%d", &m);
	n=sizeof(array)/sizeof(array[0]);
	if((m>n)||(m<0))
	{
		printf("Error");
	}
	else
	{
		for(i=m;i<n;i++)
		{
			array[i]=  array[i+1];

		}
		for(i=0;i<n-1;i++)
		{
			printf("%d	",array[i]);
		}
	}
	getch();
}