#include<stdio.h>
#include<conio.h>
void main()
{
  int r, c, i , j , k , a[100][100];
  clrscr();
  printf("Enter the number of rows and column \n");
  scanf("%d%d",&r,&c);
  for(i=0;i<r;i++)
  {

    printf("Enter the values in %d th row \n",i);
    for(j=0;j<c;j++)
    {
      scanf("%d",&a[i][j]);
    }
    printf("\n");
  }


  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      printf("%d", a[i][j]);
    }
    printf("\n");
  }
  getch();
  }
