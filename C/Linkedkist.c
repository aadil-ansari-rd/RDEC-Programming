#include <stdio.h>
#include <conio.h>
#include <malloc.h>

// Structure of linked list
struct node
{
    int data;
    struct node *next;
} *p, *start = NULL;

// Display Linked list
void display()
{
    struct node *temp;
    int i;
    temp = start;
    if (start == NULL)
    {
        printf("Your linked List is empty . \n");
    }
    else
    {
        printf("Your data in your linked list are : \n");
        while (temp != NULL)
        {
            printf("%d   ", temp->data);
            temp = temp->next;
        }
    }
    printf("\n");
}

// Insert node at the end
void insert()
{
    struct node *temp;
    int data1;
    printf("Enter your data.\n");
    scanf("%d", &data1);
    p = (struct node *)malloc(sizeof(struct node));
    p->data = data1;
    p->next = NULL;

    if (start == NULL)
    {
        start = p;
    }
    else
    {
        temp = start;
        while (temp->next != NULL)
        {
            temp = temp->next;
        }
        temp->next = p;
    }
}

// Insert a node at begining
void insertBegin()
{
    struct node *temp;
    int data1;
    printf("Enter your data.\n");
    scanf("%d", &data1);
    p = (struct node *)malloc(sizeof(struct node));
    p->data = data1;

    if (start == NULL)
    {
        p->next = NULL;
        start = p;
    }
    else
    {
        p->next = start;
        start = p;
    }
}

// Insert a node at a given location
void insertLoc()
{
    struct node *temp;
    int data1, loc, i;
    printf("Enter the position of node in the linked list : \n");
    scanf("%d", &loc);
    printf("Enter your data.\n");
    scanf("%d", &data1);
    p = (struct node *)malloc(sizeof(struct node));
    p->data = data1;
    if (loc == 1)
    {
        p->next = start;
        start = p;
    }
    else
    {
        temp = start;
        for (i = 1; i < loc - 1; i++)
        {
            temp = temp->next;
        }
        p->next = temp->next;
        temp->next = p;
    }
}

// REMEMBER :Never free start untill and unless you want to delete whole linked list

// Delete  a node in linked list at end position
void deleteENd()
{
    struct node *temp, *temp1;
    if (start == NULL)
    {
        printf("Your Linked list is already empty.\n");
    }
    else if (start->next == NULL)
    {
        free(start);
        start = NULL;
    }
    else
    {
        temp = start;
        while (temp->next != NULL)
        {
            temp1 = temp;
            temp = temp->next;
        }
        temp1->next = NULL;
        free(temp);
    }
}

// Delete  a node in linked list at begining position
void deleteBeg()
{
    struct node *temp, *temp1;
    if (start == NULL)
    {
        printf("Your Linked list is already empty.\n");
    }
    else if (start->next == NULL)
    {
        free(start);
        start = NULL;
    }
    else
    {
        temp = start;
        start = temp->next;
        free(temp);
    }
}

// Delete  a node in linked list at a given position
void deleteLoc()
{
    int i, loc;
    struct node *temp, *temp1;
    printf("Enter the location of node to be deleted : \n");
    scanf("%d", &loc);
    if (start == NULL)
    {
        printf("Your Linked list is already empty.\n");
    }
    else if (loc == 1)
    {
        temp = start;
        start = temp->next;
        free(temp);
    }
    else
    {
        temp = start;
        for (i = 1; i < loc; i++)
        {
            temp1 = temp;
            temp = temp->next;
        }
        temp1->next = temp->next;
        free(temp);
    }
}

void main()
{
    int ch;
    char c;
    do
    {
        printf("Enter your choice : \n");
        printf("Press 1 to display your linked list .\n");
        printf("Press 2 to add a node in linked list at end postion .\n");
        printf("Press 3 to add a node in linked list at begining position .\n");
        printf("Press 4 to add a node in linked list at given position.\n");
        printf("Press 5 to delete a node in linked list at end poistion.\n");
        printf("Press 6 to delete a node in linked list at begining poistion.\n");
        printf("Press 7 to delete a node in linked list at a given poistion.\n");
        // printf("Press 1 to add a node in linked list .\n");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            display();
            break;

        case 2:
            insert();
            break;

        case 3:
            insertBegin();
            break;

        case 4:
            insertLoc();
            break;

        case 5:
            deleteENd();
            break;

        case 6:
            deleteBeg();
            break;

        case 7:
            deleteLoc();
            break;

        default:
            printf("Wrong choice . \n");
        }
        printf("Do you want to continue ? Y/N \n");
        fflush(stdin);
        scanf("%c", &c);
    } while (c == 'Y' || c == 'y');
    getch();
}