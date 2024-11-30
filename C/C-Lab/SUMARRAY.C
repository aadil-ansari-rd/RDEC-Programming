#include<stdio.h>
#include<conio.h>
void main()
{
   int a[5],b[5],sum[5],n,i;
   clrscr();
   for(i=0;i<5;i++){
     printf("Enter the value at %d th place \n",i);
     scanf("%d",&a[i]);
     }
   for(i=0;i<5;i++){
     printf("Enter the value at %d th place \n", i);
     scanf("%d", &b[i]);
     }
   for(i=0;i<5;i++){
     sum[i] = a[i] + b[i];
     printf("%d", sum[i]);
     }

   getch();
   }