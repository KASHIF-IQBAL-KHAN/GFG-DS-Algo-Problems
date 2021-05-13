/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a sorted circular linked list, the task is to insert a new node in this circular list so that it remains a sorted circular linked list.

Example 1:

Input:
LinkedList = 1->2->4
(the first and last node is connected,
i.e. 4 --> 1)
data = 2
Output: 1 2 2 4

Example 2:

Input:
LinkedList = 1->4->7->9
(the first and last node is connected,
i.e. 9 --> 1)
data = 5
Output: 1 4 5 7 9

Your Task:
The task is to complete the function sortedInsert() which should insert the new node into the given circular linked list and return the head of the linkedlist.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
0 <= N <= 105
*/

// Kashif Iqbal
// 13-May-2021	

class Solution
{
	public static Node sortedInsert(Node head,int data) {
	    
	    Node temp = new Node(data);
	    Node current = head;
	    
	    if(head == null){
	        head = temp;
	        head.next = head;
	    }
	    
	    else if(data <= current.data){
	        while(current.next != head){
	            current = current.next;
	        }
	        current.next = temp;
	        temp.next = head;
	        head = temp;
	    }
	    
	    else{
            while(current.next != head && data > current.next.data){
	        current = current.next;
	    }
            temp.next = current.next;
            current.next = temp;
            current = temp;
            }

	    return head;
     }
}