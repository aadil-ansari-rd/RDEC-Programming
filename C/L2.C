#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct node{
	int data ;
	struct node *link;
	};

// globally declared
struct node *head = NULL;

//function for creat new node
struct node * creat_node()
{
	return (struct node *) malloc(sizeof(struct node));
}

//insert node  at the beginning
void Iatbegining()
{
	int value ;
	struct node *new_node = creat_node();
	scanf("%d",&value);
	new_node->node = value;
	new_node->link = head;
	head = new_node;
}