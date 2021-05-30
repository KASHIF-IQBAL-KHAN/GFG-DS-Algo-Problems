/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Tree. Return 1 if, for every node X in the tree other than the leaves, its value is equal to the sum of its left subtree's value and its right subtree's value. Else return 0.

An empty tree is also a Sum Tree as the sum of an empty tree can be considered to be 0. A leaf node is also considered a Sum Tree.
 
Example 1:

Input:
    3
  /   \    
 1     2

Output: 1

Explanation: 

The sum of left subtree and right subtree is 1 + 2 = 3, which is the value of the root node.
Therefore,the given binary tree is a sum tree.

Example 2:

Input:

          10
        /    \
      20      30
    /   \ 
   10    10

Output: 0   

Explanation:

The given tree is not a sum tree. For the root node, sum of elements in left subtree is 40 and sum of elements in right subtree is 30. Root element = 10 which is not equal to 30+40.

Your Task: 

You dont need to read input or print anything.Complete the function isSumTree() which takes root node as input parameter and returns true if the tree is a SumTree else it returns false.
 
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(Height of the Tree)

Constraints:
1 ≤ number of nodes ≤ 104
*/

// Kashif Iqbal
// 28-May-2021	

class Solution{
    
    int subTreeSum(Node ptr){
        
        if(ptr == null){
            return 0;
        }
        
        return subTreeSum(ptr.left) + subTreeSum(ptr.right) + ptr.data;
    }
        
	boolean isSumTree(Node root){
	    
	    if(root == null){
	        return true;
	    }
	    
	    if(root.left != null && root.right != null){
    	    if(subTreeSum(root.left) + subTreeSum(root.right) != root.data){
    	        return false;
    	    }
	    }
	   
	    isSumTree(root.left);
	    isSumTree(root.right);
	     
	    return true; 
	}
}
