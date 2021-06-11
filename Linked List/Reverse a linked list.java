/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a linked list of N nodes. The task is to reverse this list.

Example 1:

Input:
LinkedList: 1->2->3->4->5->6

Output: 6 5 4 3 2 1
Explanation: After reversing the list, elements are 6->5->4->3->2->1.

Example 2:

Input:
LinkedList: 2->7->8->9->10

Output: 10 9 8 7 2
Explanation: After reversing the list, elements are 10->9->8->7->2.

Your Task:
The task is to complete the function reverseList() with head reference as the only argument and should return new head after reversing the list.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= N <= 104
*/

// Kashif Iqbal
// 11-June-2021	

class Solution {
    
    Node reverseList(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        
        Node prev = null;
        Node current = head;
        Node next = current.next;
        
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
}
