#include<stdio.h>
#include<conio.h>
void main()
{
  int i ,j, a[5],c;
  clrscr();
  for(i=0;i<5;i++)
  {
    printf("Enter the %d th value : ",i);
    scanf("%d", &a[i]);
  }
  printf("\n Your input array is : ");
  for(i=0;i<5;i++)
  {
    printf("%d ", a[i]);
  }
  printf("\n Sorted Array is : ");
  for(i=0;i<5;i++)
  {
    for(j=0;j<5;j++)
    {
      if(a[j] > a[j+1])
      {

	c=a[j]	;
	a[j]=a[j+1];
	a[j+1]=c;

	}
    }
  }
  for(i=0;i<5;i++)
  {
    printf("%d ",a[i]);
    }
  getch();
  }


