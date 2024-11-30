 #include<stdio.h>
 #include<conio.h>
 #include<stdlib.h>
 int stack[100];
 int top = -1;

 //Push Function
 void push()
 {
	int data ;
	if(top==99)
	{
		printf("\nStack Overflow");
	}
	else
	{

		printf("\nEnter the data item to be inseted :  ");
		scanf("%d", &data);
		top++;
		stack[top]= data;
	}
 }

 //Pop Function
 void pop()
 {
	if(top==-1)
	{
		printf("\nStack is empty ");
	}
	else
	{
		printf("\nElement on top : %d ", stack[top]);
		top--;
	}
 }

 //Display Function
 void display()
 {
	int i ;
	if(top==-1)
	{
		printf("\nStack is empty");
	}
	else
	{
		for(i=top;i>=0;i--)
		{
			printf("\n");
			printf("%d\n", stack[i]);
		}
	}
 }

 int main()
 {
	int ch ;
	clrscr();
	do
	{
		printf("\nPress 1 for push operation");
		printf("\nPress 2 for pop operation");
		printf("\nPress 3 for display elements");
		printf("\nPress 4 to exit the program     ");
		scanf("%d",&ch);

		switch(ch)
		{
			case 1 :
			push();
			break;

			case 2 :
			pop();
			break;

			case 3 :
			display();
			break;

			case 4:
			exit(0);
			break;

			default:
			printf("\nWrong choice : Try again  ");
		}
	}while(ch!=4);
	return 1;
 }











