/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
Given two lists sorted in increasing order, create a new list representing the intersection of the two lists. The new list should be made with its own memory — the original lists should not be changed.

Example 1:

Input:
L1 = 1->2->3->4->6
L2 = 2->4->6->8
Output: 2 4 6
Explanation: For the given first two
linked list, 2, 4 and 6 are the elements
in the intersection.

Example 2:

Input:
L1 = 10->20->40->50
L2 = 15->40
Output: 40
Your Task:
The task is to complete the function intersection() which should find the intersection of two linked list and add all the elements in intersection to the third linked list and return the head of the third linked list.

Expected Time Complexity : O(n+m)
Expected Auxilliary Space : O(n+m)
Note: n,m are the size of the linked lists.

Constraints:
1 <= size of linked lists <= 5000
1 <= Data in linked list nodes <= 1000
*/

// Kashif Iqbal
// 12-May-2021	

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node interSectionListHead = null;
        Node tail = null;
        
        while(head1 != null &&   head2 != null) {
            
            if(head1.data < head2.data){
                head1 = head1.next;
            } 
            
            else if(head2.data < head1.data) {
                head2 = head2.next;
            } 
            
            else {
                Node temp = new Node(head2.data);
                
                if(interSectionListHead == null){
                    interSectionListHead = temp;
                    tail = temp;
                } 
                else {
                    tail.next = temp;
                    tail = temp;
                }
                
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        
        return interSectionListHead;
    }
}