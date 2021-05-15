/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a linked list, delete N nodes after skipping M nodes of a linked list until the last of the linked list.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains number of elements in the linked list and next M and N respectively space separated. The last line contains the elements of the linked list.

Output:
Function should not print any output to stdin/console.

User Task:
The task is to complete the function linkdelete() which should modify the linked list as required.

Example:
Input:
2
8
2 1
9 1 3 5 9 4 10 1
6
6 1
1 2 3 4 5 6

Output: 
9 1 5 9 10 1
1 2 3 4 5 6

Explanation:
Testcase 1: Deleting one node after skipping the M nodes each time, we have list as 9-> 1-> 5-> 9-> 10-> 1.
*/

// Kashif Iqbal
// 15-May-2021	

class Solution
{
    static void linkdelete(Node head, int M, int N)
    {

        Node ptr = head;
        Node tail = null;

        while(ptr != null){
        
        for(int itr = 0; itr < M; ++itr){
            if(ptr != null){
                tail = ptr;
                ptr = ptr.next;
            }
        }
        
        for(int itr = 0; itr < N; ++itr){
            if(ptr != null){
                ptr = ptr.next;
            }
        }
        
        tail.next = ptr;
        
        }
    }
}