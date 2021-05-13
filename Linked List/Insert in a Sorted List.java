/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a sorted singly linked list and a data, your task is to insert the data in the linked list in a sorted way i.e. order of the list doesn't change.

Example 1:

Input:
LinkedList: 25->36->47->58->69->80
data: 19
Output: 19 25 36 47 58 69 80

Example 2:

Input:
LinkedList: 50->100
data: 75
Output: 50 75 100
Your Task:
The task is to complete the function sortedInsert() which should insert the element in sorted Linked List and return the head of the linked list

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 104
-99999 <= A[i] <= 99999, for each valid i
*/

// Kashif Iqbal
// 13-May-2021	

class Solution {
    Node sortedInsert(Node head1, int key) {
        
        Node temp = new Node(key);
        Node current = head1;
        
        if(head1 == null || key <= current.data){
            temp.next = head1;
            head1 = temp;
            return head1;
        }
        
        while(current.next != null && key > current.next.data){
            current = current.next;
        }

        temp.next = current.next;
        current.next = temp;
        
        return head1;
    }
}