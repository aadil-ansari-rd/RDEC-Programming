#include<stdio.h>
#include<conio.h>
void main()
{
  int i , j ,a[5][5], b[5][5],s[5][5];
  printf("This is first array \n ");
  for(i=0;i<5;i++)
  {
    for(j=0;j<5;j++)
    {
      printf("Enter the value in %d th row and %d th column \n", i , j);
      scanf("%d", &a[i][j]);
    }
    printf("\n");
  }
  for(i=0;i<5;i++)
  {
    for(j=0;j<5;j++)
    {
      printf("%d",a[i][j]);
    }
    printf("\n");
  }

  printf("This is first array \n ");

  for(i=0;i<5;i++)
  {
    for(j=0;j<5;j++)
    {
      printf("Enter the value in %d th row and %d th column \n", i , j);
      scanf("%d", &b[i][j]);
    }
    printf("\n");
  }
  for(i=0;i<5;i++)
  {
    for(j=0;j<5;j++)
    {
      printf("%d",b[i][j]);
    }
    printf("\n");
  }

  printf("This is sum array ");

  for(i=0;i<5;i++)
  {
    for(j=0;j<5;j++)
    {
      s[i][j]=a[i][j] +b[i][j] ;
    }
    printf("\n");
  }
  for(i=0;i<5;i++)
  {
    for(j=0;j<5;j++)
    {
      printf("%d",s[i][j]);
    }
    printf("\n");
  }

  getch();
  }
