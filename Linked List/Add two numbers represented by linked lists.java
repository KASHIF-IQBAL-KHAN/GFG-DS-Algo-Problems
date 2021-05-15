/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given two numbers represented by two linked lists of size N and M. The task is to return a sum list. The sum list is a linked list representation of the addition of two input numbers from the last.

Example 1:

Input:
N = 2
valueN[] = {4,5}
M = 3
valueM[] = {3,4,5}
Output: 3 9 0  
Explanation: For the given two linked list (4 5) and (3 4 5), after adding the two linked list resultant linked
list will be (3 9 0).

Example 2:

Input:
N = 2
valueN[] = {6,3}
M = 1
valueM[] = {7}
Output: 7 0
Explanation: For the given two linked list (6 3) and (7), after adding the two linked list resultant linked list
will be (7 0).

Your Task:
The task is to complete the function addTwoLists() which has node reference of both the linked lists and returns the head of the new list.        

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(Max(N,M))

Constraints:
1 <= N, M <= 5000
*/

// Kashif Iqbal
// 15-May-2021	

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        
        if(first == null){
            return second;
        }
        
        if(second == null){
            return first;
        }
        
        Stack<Integer> firstStack = new Stack<>();
        Stack<Integer> secondStack = new Stack<>();
        
        Node head = null;
        int carry = 0;
        
        while(first != null){
            firstStack.add(first.data);
            first = first.next;
        }
        
        while(second != null){
            secondStack.add(second.data);
            second = second.next;
        }
        
        while(!firstStack.isEmpty() || !secondStack.isEmpty()){
            
            int a = 0;
            int b = 0;
        
            if(!firstStack.isEmpty()){
                a = firstStack.pop();
            }
            
            if(!secondStack.isEmpty()){
                b = secondStack.pop();
            }
            
            int total = a + b + carry;
            carry = total / 10;
      
            Node temp = new Node(total % 10);
            
            if(head == null){
                head = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }
        
        if(carry != 0){
            Node temp = new Node(carry);
            temp.next = head;
            head = temp;
        }

        return head;
    }
}