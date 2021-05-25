/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a binary tree. Check whether it is a BST or not.
Note: We are considering that BSTs can not contain duplicate Nodes.

Example 1:

Input:
    2
 /    \
1      3

Output: 1 

Explanation: 
The left subtree of root node contains node 
with key lesser than the root node’s key and 
the right subtree of root node contains node 
with key greater than the root node’s key.
Hence, the tree is a BST.

Example 2:

Input:
  2
   \
    7
     \
      6
       \
        5
         \
          9
           \
            2
             \
              6
Output: 0 

Explanation: 
Since the node with value 7 has right subtree 
nodes with keys less than 7, this is not a BST.
Your Task:
You don't need to read input or print anything. Your task is to complete the function isBST() which takes the root of the tree as a parameter and returns true if the given binary tree is BST, else returns false. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the BST).

Constraints:
0 <= Number of edges <= 100000
*/

// Kashif Iqbal
// 21-May-2021	

//Iterative

public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    
    void inOrder(Node ptr , ArrayList<Integer> list){
        
        if(ptr == null){
            return;
        }
        
        inOrder(ptr.left , list);
        list.add(ptr.data);
        inOrder(ptr.right , list);
    }
    
    boolean isBST(Node root)
    {
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root , list);
        
        for(int itr = 0; itr < list.size()-1; ++itr){
            if(list.get(itr) >= list.get(itr + 1)){
                return false;
            }
        }
        
        return true;
    }
}