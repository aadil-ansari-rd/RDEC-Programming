#include<stdio.h>
#include<conio.h>
struct node{
	int data ;
	struct node *link;
	};
void main()
{
	struct node *head = NULL;
	clrscr();
	head =(struct node *)malloc(sizeof(struct node));
	printf("Enter the value to be added in the linklist");
	scanf("%d", &head->data);
	head -> link = (struct node *)malloc(sizeof(struct node));
	head->link->data = 40;
	head->link->link = NULL ;

	printf("%d\n",head->data);
	printf("%d", head->link->data );
	getch();
}
