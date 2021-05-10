/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

Example 1:

Input:
LinkedList: 4->5->6
Output: 457 

Example 2:

Input:
LinkedList: 1->2->3
Output: 124 

Your Task:
Your task is to complete the function addOne() which takes the head of the linked list as the only argument and returns the head of the modified linked list. The driver code prints the number.
Note: The head represents the left-most digit of the number.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 10100*/

// Kashif Iqbal
// 10-May-2021	

class Solution
{
    public:
    Node* reverse(Node* head){
        Node *prev = NULL;
        Node *next = NULL;
        Node* current = head;
        
        while(current != NULL){
            next = current -> next;
            current -> next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
    
    Node* addOne(Node *head) 
    {
        Node *reverseHead = reverse(head);
        Node *tempReverseHead = reverseHead;

        while(reverseHead != NULL){
            if(reverseHead -> data == 9){
                if(reverseHead -> next == NULL){
                    reverseHead -> data++;
                }
                else{
                    reverseHead -> data = 0;
                }
                reverseHead = reverseHead -> next;
            }
            else{
                reverseHead -> data =  reverseHead -> data + 1;
                break;
            }
        }
        
        head = reverse(tempReverseHead);
        return head;
    }
};