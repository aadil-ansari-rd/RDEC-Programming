#include<stdio.h>
#include<conio.h>
void main()
{
  int n, i , j , a[100][100], b[100][100] , c[100][100];
  clrscr();
  printf("Enter the size of the array : n = ");
  scanf("%d",&n);
  printf("\n Enter the value in second array");
  for(i=0;i<n;i++)
  {
    for (j=0; j<n; j++)
    {
     printf("\n Enter the value at %d th row & %d th column",i,j);
     scanf("%d", &a[i][j]);
    }
  }
  printf("\n Your First array is : \n");
  for(i=0;i<n;i++)
  {
    for (j=0; j<n; j++)
    {
      printf("%d \t", a[i][j]);
    }
    printf("\n");
  }
  printf("\n Enter the value in second array");
  for(i=0;i<n;i++)
  {
    for (j=0; j<n; j++)
    {
     printf("\n Enter the value at %d th row & %d th column",i,j);
     scanf("%d", &b[i][j]);
    }
  }
  printf("\n Your Second array is : \n");
  for(i=0;i<n;i++)
  {
    for (j=0; j<n; j++)
    {
      printf("%d \t", b[i][j]);
    }
    printf("\n");
  }
  for(i=0;i<n;i++)
  {
    for (j=0; j<n; j++)
    {
      c[i][j] = a[i][j] * b[i][j] ;
    }
  }
  printf("\n Your Multiply  array is : \n");
  for(i=0;i<n;i++)
  {
    for (j=0; j<n; j++)
    {
      printf("%d \t", c[i][j]);
    }
    printf("\n");
  }
  printf("\n Your Transpose Multiply  array is : \n");
  for(i=0;i<n;i++)
  {
    for (j=0; j<n; j++)
    {
      printf("%d \t", c[j][i]);
    }
    printf("\n");
  }
  getch();
  }