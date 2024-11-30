
#include<stdio.h>
#include<conio.h>
void main()
{
 int n , a[100],r,j, i,m;
 clrscr();
 printf("Enter the size of array");
 scanf("%d", &n);
 for(i=0;i<n;i++)
 {
   printf("Enter the value at %d th place : ", i);
   scanf("%d",&a[i]);
 }
 printf("Prime numbera are : \n");
 for(i=0;i<n;i++)
 {
   if(a[i]<2)
   {
     break ;
   }
   if(a[i]==2)
   {
     printf("%d",a[i]);
     printf("\n");
   }
   else
   {
     m=a[i];
     for(j=2;j<a[i];j++)
     {
       r=m%j;
       if(r==0)
       {
	 j=a[i];
       }
     }
     if(r!=0)
     {
      printf("%d",a[i]);
      printf("\n");
     }
   }
 }
 getch();
}

