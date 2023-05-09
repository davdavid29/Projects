//Maverick Dave Aguinaldo
//Earl John Bumanglag
//BSCpE-2A 2019

#include <iostream>
#include <stdlib.h>
#include <string.h>
using namespace std;

typedef struct node
{
     int studId;
     char name[30];
     char course[30];
     int age;
     char gender[10];
     struct node* next;
} node;


typedef void (*callback)(node* data);


node* create(int studId, char name[100], char course[100], int age, char gender[100],node* next)
{
    node* new_node = (node*)malloc(sizeof(node));
    if(new_node == NULL)
    {
        printf("Error creating a new node.\n");
        exit(0);
    }
    new_node -> studId = studId;
    strcpy(new_node->name,name); 
    strcpy(new_node->course,course);
    new_node->age=age;
    strcpy(new_node->gender,gender);
    new_node->next = next;
    return new_node;
}


node* prepend(node* head, int studId,char name[100],char course[100],int age,char gender[100])
{
    node* new_node = create(studId,name,course,age,gender,head);
    head = new_node;
    return head;
}


void traverse(node* head, callback f)
{
	cout <<endl<<"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    cout <<endl<< "StudId\tName\tCourse\tAge\tGender";
    cout <<endl<<"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"<<endl;
    node* cursor = head;
    while(cursor != NULL)
    {
        f(cursor);
        cursor = cursor->next;
    }
}


node* remove_front(node* head)
{
    if(head == NULL)
        return NULL;
    node *front = head;
    head = head->next;
    front->next = NULL;
    
    if(front == head)
        head = NULL;
    free(front);
    return head;
}


node* remove_back(node* head)
{
    if(head == NULL)
        return NULL;
 
    node *cursor = head;
    node *back = NULL;
    while(cursor->next != NULL)
    {
        back = cursor;
        cursor = cursor->next;
    }
 
    if(back != NULL)
        back->next = NULL;
 
    
    if(cursor == head)
        head = NULL;
 
    free(cursor);
 
    return head;
}


node* remove_any(node* head, node* nd)
{
    if(nd == NULL)
        return NULL;
    
    if(nd == head)
        return remove_front(head);
 
    
    if(nd->next == NULL)
        return remove_back(head);
 
    
    node* cursor = head;
    while(cursor != NULL)
    {
        if(cursor->next == nd)
            break;
        cursor = cursor->next;
    }
 
    if(cursor != NULL)
    {
        node* tmp = cursor->next;
        cursor->next = tmp->next;
        tmp->next = NULL;
        free(tmp);
    }
    return head;
 
}


void display(node* n)
{
    if(n != NULL)
    	cout<<n->studId<<"\t"<<n->name<<"\t"<<n->course<<"\t"<<n->age<<"\t"<<n->gender<<endl;
}


node* search(node *head, int studId)
{
    node *cursor = head;
    while(cursor!=NULL)
    {
        if(cursor->studId == studId)
            return cursor;
        cursor = cursor->next;
    }
    return NULL;
}


void dispose(node *head)
{
    node *cursor, *tmp;
 
    if(head != NULL)
    {
        cursor = head->next;
        head->next = NULL;
        while(cursor != NULL)
        {
            tmp = cursor->next;
            free(cursor);
            cursor = tmp;
        }
    }
}


int count(node *head)
{
    node *cursor = head;
    int c = 0;
    while(cursor != NULL)
    {
        c++;
        cursor = cursor->next;
    }
    return c;
}


void menu()
{
	cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
    cout << "      Student Record Management System" << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
    cout << "1. Add" << endl;
	cout << "2. Search" << endl;
	cout << "3. Update/Edit" << endl;
	cout << "4. Delete" << endl;
	cout << "5. Display All List" << endl;
	cout << "6. Exit" << endl;
	cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
 
}

void displayAll(node *head)
{
	cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
    cout << endl << "StudId\tName\tCourse\tAge\tGender" << endl << endl;
    cout << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
    node *cursor=head;
    while(cursor != NULL)
    {
        cursor = cursor->next;
        
    	cout<<cursor->studId<<"\t"<<cursor->name<<"\t"<<cursor->course<<"\t"<<cursor->age<<"\t"<<cursor->gender<<endl;   
    }
}

int main()
{
    int choice = 0;
    int n,i;
    int studId;
    char name[50];
    char course[50];
    int age;
    char gender[50];
 
    node* head = NULL;
    node* tmp = NULL;
    callback disp = display;
 
    menu();
    
    while(1)
    {
        cout << "Enter your choice: ";
        cin >> choice;
 
        if(choice == 6)
           break;
            
        switch(choice)
        {   
            
        case 1:
        	again:
        	cout << endl << "Enter Student Id: ";
            cin >> studId;
            
            tmp = search(head, studId);
        	if(tmp != NULL)
        	{
        		cout << "Student Id Already Exist!"; 
        		cout << endl;
        		goto again;
			}
            
            cout << "Enter Name: "; 
            cin >> name;
    
            cout << "Enter Course: ";
	        cin >> course;
	
	        cout << "Enter Age: ";
	        cin >> age;
	
	        cout << "Enter Gender: ";
	        cin >> gender;
            
            head = prepend(head,studId,name,course,age,gender);
            traverse(head,disp); 
            cout << endl; 
            break;
            
        case 2:
            cout << endl << "Enter Student Id to Search: ";
            cin >> studId;
            
            tmp = search(head, studId);
            if(tmp != NULL)
            {
            	cout <<endl<<"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
                cout <<endl<<"StudId\tName\tCourse\tAge\tGender";
                cout <<endl<<"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"<<endl;  
                display(tmp);
                cout << endl; 
            }
            else
            {
                cout << "No Existing Data!" << endl << endl;
            }
            break;
            
        case 3:
            cout << endl << "Enter Student Id to Update: ";
            cin >> studId;
            
            tmp = search(head, studId);
            if(tmp != NULL)
            {
            cout << "Enter Name: ";
            cin >> name;
            
            cout << "Enter Course: ";
            cin >> course;
            
            cout << "Enter Age: ";
            cin >> age;
            
            cout << "Enter Gender: ";
            cin >> gender;
            
            strcpy(tmp->name,name);
            strcpy(tmp->course,course);
            tmp->age=age;
            strcpy(tmp->gender,gender);
            cout << endl << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
            cout << endl << "StudId\tName\tCourse\tAge\tGender";
            cout << endl << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
            display(tmp);
            cout << endl; 
            }
            else
            {
                cout << "No Existing Data!" << endl << endl;
            }
            break;
            
        case 4:
            cout << endl << "Enter Student Id to Delete: ";
            cin >> studId;
            
            tmp = search(head,studId);
            if(tmp != NULL)
            {
               head=remove_any(head,tmp);
               cout << "Student Record Deleted!" << endl;
                if(head != NULL)
                    traverse(head,disp);
                    cout << endl; 
            }
            else
            {
                 cout << "No Existing Data!" << endl << endl;
            }
            break;
            
        case 5:
            if(head == NULL)
            {
            	    cout << endl << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
                    cout << endl << "StudId\tName\tCourse\tAge\tGender";
                    cout << endl << "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" << endl;
                    cout << "\t  No Existing Data!" << endl << endl;
            }
            else
            {
                traverse(head,disp);
                cout << endl; 
            }
           break;
           
        default:
           	cout << "Wrong choice!" << endl << endl;
            break;
        }
    }
    dispose(head);
    return 0;
}


