#include<stdio.h>
#include<conio.h>
void main()
{
	int i,m, n,data;
	int array[] = { 1,2,3,4,5};
	clrscr();
	printf("Enter the index on which you want to insert data");
	scanf("%d", &m);
	printf("\nEnter the data ");
	scanf("%d", &data);
	n=sizeof(array)/sizeof(array[0]);
	if((m>n)||(m<0))
	{
		printf("Error");
	}
	else
	{
		array[m]=data;

		for(i=0;i<n;i++)
		{
			printf("%d	", array[i]);
		}
	}
	getch();
}