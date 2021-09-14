/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

You are given a linked list of N nodes. Remove the loop from the linked list, if present. 
Note: X is the position of the node to which the last node is connected to. If it is 0, then there is no loop.

Example 1:

Input:

N = 3
value[] = {1,3,4}
X = 2

Output: 1

Explanation: The link list looks like
1 -> 3 -> 4
     ^    |
     |____|    
     
A loop is present. If you remove it 
successfully, the answer will be 1. 

Example 2:

Input:

N = 4
value[] = {1,8,3,4}
X = 0

Output: 1

Explanation: The Linked list does not 
contains any loop. 

Your Task:
You don't need to read input or print anything. Your task is to complete the function removeLoop() which takes the head of the linked list as input parameter. Simply remove the loop in the list (if present) without disconnecting any nodes from the list. The driver code will print 1 if your code is correct.

Expected time complexity : O(n)
Expected auxiliary space : O(1)

Constraints:
1 <= N <= 104
*/

// Kashif Iqbal
// 26-May-2021	

class Solution
{

    public static void removeLoop(Node head){
        
        HashMap<Node , Integer> map = new HashMap<>();
        
        Node ptr = head;
        
        while(ptr != null){
            
            if(!map.containsKey(ptr.next)){
                map.put(ptr , ptr.data);
                ptr = ptr.next;
            }
            
            else{
                ptr.next = null;
            }
 
        }
    }
}

//O(1) Space

class Solution {
    
    public static int length(Node head) {
        int count = 1;
        Node first = head;
        while (first.next != head) {
            ++count;
            first = first.next;
        }
        return count;
    }

    public static Node detectLoop(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return null;
    }

    public static void removeLoop(Node head) {
        Node ptr = detectLoop(head);
        if (ptr != null) {
            int len = length(ptr);
            ptr = head;
            Node q = head;

            for (int itr = 0; itr < len; ++itr) {
                q = q.next;
            }

            while (q != ptr) {
                q = q.next;
                ptr = ptr.next;
            }

            while (q.next != ptr) {
                q = q.next;
            }
            q.next = null;
        }
    }
}
