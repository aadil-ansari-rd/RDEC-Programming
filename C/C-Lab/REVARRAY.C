#include<stdio.h>
#include<conio.h>
void main()
{
 int n , a[100], i;
 printf("Enter the size of the array");
 scanf("%d", &n);
 for(i=0;i<n;i++)
 {
   printf("Enter the %d th value", i);
   scanf("%d", &a[i]);
   }
 printf("Your Arrayis \n ");
 for(i=0;i<n;i++)
 {

   printf("%d \t", a[i]);
   }

 printf("Your reversed array is \n");
 for(i=n;i>0;i--)
 {

   printf("%d \t", a[i]);
   }
 getch();
 }