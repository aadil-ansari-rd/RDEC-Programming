#include<stdio.h>
#include<conio.h>
void main()
{
   int i , j , n ,a[5],b[5];
   clrscr();
   printf("Enter the values in the array \n");
   for(i=0;i<5;i++)
   {
      scanf("%d",&a[i]);
   }
   printf("This is your array \n");
   for(i=0;i<5;i++)
   {
      printf("%d",a[i]);
   }
   printf("\n");

   for(i=0;i<5;i++)
   {
     n=a[i];
     for(j=0;j<5;j++)
     {
       if(a[j]>n)
       {
	n=a[j];
       }

     }
     b[i]=n;
   }
   printf("Array in increase order");
   for(i=0;i<5;i++)
   {
      printf("%d",b[i]);
   }
   getch();
}

