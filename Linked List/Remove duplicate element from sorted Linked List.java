/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a singly linked list consisting of N nodes. The task is to remove duplicates (nodes with duplicate values) from the given list (if exists).
Note: Try not to use extra space. Expected time complexity is O(N). The nodes are arranged in a sorted way.

Example 1:

Input:
LinkedList: 2->2->4->5
Output: 2 4 5
Explanation: In the given linked list 
2 ->2 -> 4-> 5, only 2 occurs more 
than 1 time.

Example 2:

Input:
LinkedList: 2->2->2->2->2
Output: 2
Explanation: In the given linked list 
2 ->2 ->2 ->2 ->2, 2 is the only element
and is repeated 5 times.
Your Task:
The task is to complete the function removeDuplicates() which should remove the duplicates 
from linked list and return the head of the linkedlist.

Expected Time Complexity : O(N)
Expected Auxilliary Space : O(1)

Constraints:
1 <= Number of nodes <= 10
*/

// Kashif Iqbal
// 11-May-2021	

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        if(head == null){
            return null;
        }
        
        Node ptr = head;

        while(ptr.next != null){
            if(ptr.data == ptr.next.data){
                ptr.next = ptr.next.next;
            }
            else{
                ptr = ptr.next;
            }
        }
        
        return head;
    }
}