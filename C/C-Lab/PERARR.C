#include<stdio.h>
#include<conio.h>
void main()
{
  int i , n , a[100], sum=0, per;
  clrscr();
  printf("Enter the number of subjects \n " ,&n);
  scanf("%d",&n);
  for(i=0;i<n;i++){
    printf("Enter the marks obtained in %d th subject \n",i);
    scanf("%d", &a[i]);
    }
  for(i=0;i<n;i++){
    sum = sum + a[i];
    }
  per = sum/n;
  printf("Your percentage is %d \n", per);
  if(per>=60){
    printf("First division");
    }
  else if((per< 60)&&(per>=45))
  {
    printf("Second division");
    }
  else if((per<45)&&(per>=33)){
    printf("Third division");
    }
  else{
    printf("Fail");

    }
  getch();
  }
