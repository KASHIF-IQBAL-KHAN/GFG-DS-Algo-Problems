/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Input:
Circular LinkedList: 2->6->1->5

Output:
2 6
1 5

Your Task:
Your task is to complete the given function splitList(), which takes 3 input parameters: The address of the head of the linked list, addresses of the head of the first and second halved resultant lists and Set the head1_ref and head2_ref to the first resultant list and second resultant list respectively.

Expected Time Complexity: O(N)
Expected Auxilliary Space: O(1)

Constraints:
1 <= N <= 100
*/

// Kashif Iqbal
// 2-June-2021	

class Solution
{
    Node reverse(Node head){
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    boolean isPalindrome(Node head) 
    {
        if(head == null){
            return true;
        }
        Node slow  = head;
        Node fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node pal = reverse(slow.next);
        
        slow.next = null;
        slow = head;
        
        while(pal != null){
            if(slow.data != pal.data){
                return false;
            }
            slow = slow.next;
            pal = pal.next;
        }
        
        return true;
    }    
}

