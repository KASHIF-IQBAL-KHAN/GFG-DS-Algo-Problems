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

class gfg {

    void splitList(circular_LinkedList list) {
        
        int size = 0;
        Node temp = list.head;
        list.head1 = list.head;
        list.head2 = list.head;
        
        while(temp.next != list.head) {
            size  = size + 1;
            temp = temp.next;
        }
        
        for(int itr = 0; itr < size/2; ++itr){
            list.head = list.head.next;
            list.head2 = list.head;
        }
        
        list.head2 = list.head2.next;
        list.head.next = list.head1;
        temp.next = list.head2;
    }
}