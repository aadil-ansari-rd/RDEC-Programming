#include<stdio.h>
#include<conio.h>
void main()
{
	int i,m, num, d=0;
	int array[] = { 1,5,6,3,4,85,5,5,5,9};
	clrscr();
	printf("Enter the number you want to search \n");
	scanf("%d", &num);
	m = sizeof(array)/sizeof(array[0]);
	printf("The indexes are : \n");
	for(i=0;i<m;i++)
	{
		if(array[i]==num)
		{
			d=1;
			printf("%dth	", i);
		}
	}
	if(d==0)
	{
		 printf("\n Element is not found in the array ");
	}
	getch();
}

