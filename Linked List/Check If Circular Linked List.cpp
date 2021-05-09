/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
*/

// Kashif Iqbal
// 09-May-2021	
bool isCircular(Node *head)
{
       if(head == NULL){
            return true;
        }
        Node *temp = head;
        
        while(temp->next!=NULL&&temp->next!=head)
        temp=temp->next;
        if(temp->next==NULL)
            return false;
        else
            return true;
}
        