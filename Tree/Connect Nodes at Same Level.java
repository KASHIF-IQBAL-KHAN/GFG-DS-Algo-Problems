/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a binary tree, connect the nodes that are at same level. You'll be given an addition nextRight pointer for the same.

Initially, all the nextRight pointers point to garbage values. Your function should set these pointers to point next right for each node.
       10                       10 ------> NULL
      / \                       /      \
     3   5       =>     	3 ------> 5 --------> NULL
    / \     \               /  \           \
   4   1   2         	    4 --> 1 -----> 2 -------> NULL

 

Example 1:

Input:
     3
   /  \
  1    2
  
Output:
3 1 2
1 3 2

Explanation:The connected tree is
        3 ------> NULL
     /    \
    1-----> 2 ------ NULL
Example 2:

Input:
      10
    /   \
   20   30
  /  \
 40  60
 
Output:
10 20 30 40 60
40 20 60 10 30

Explanation:The connected tree is
         10 ----------> NULL
       /     \
     20 ------> 30 -------> NULL
  /    \
 40 ----> 60 ----------> NULL
*/

// Kashif Iqbal
// 24-May-2021	

  class Solution{
    
    public void connect(Node root){    
        
        LinkedList<Node> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            Node ptr = null;
            while(size > 0){
                Node temp = queue.pollFirst();
                
                if(ptr == null){
                    ptr = temp;
                    ptr.nextRight = null;
                } else {
                    ptr.nextRight = temp;
                    ptr = temp;
                }
                
                if(temp.left != null){
                    queue.add(temp.left);
                }
                
                if(temp.right != null){
                    queue.add(temp.right);
                }
                size = size - 1;
            }
        }
        
    }
}
