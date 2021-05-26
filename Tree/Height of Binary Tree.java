/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a binary tree, find its height.

Example 1:

Input:
     1
    /  \
   2    3
   
Output: 2

Example 2:

Input:
  2
   \
    1
   /
 3
 
Output: 3   

Your Task:

You don't need to read input or print anything. Your task is to complete the function height() which takes root node of the tree as input parameter and returns an integer denoting the height of the tree. If the tree is empty, return 0. 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= Number of nodes <= 105
1 <= Data of a node <= 105
*/

// Kashif Iqbal
// 26-May-2021	

class Solution{
    
    int height(Node root){
        
        if(root == null){
            return 0;
        }
        
        //return (1 + Math.max(height(root.left) , height(root.right)));
        
        int x = height(root.left);
        int y = height(root.right);
        
        if(x > y){
            return x + 1;
        }
        else{
            return y + 1;
        }
        
    }
}

