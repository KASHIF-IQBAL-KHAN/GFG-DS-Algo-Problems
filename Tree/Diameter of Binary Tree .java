/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Tree, find diameter of it.

The diameter of a tree is the number of nodes on the longest path between two end nodes in the tree. The diagram below shows two trees each with diameter nine, the leaves that form the ends of a longest path are shaded (note that there is more than one path in each tree of length nine, but no path longer than nine nodes).



Example 1:

Input:
       1
     /  \
    2    3
    
Output: 3

Example 2:

Input:
         10
        /   \
      20    30
    /   \ 
   40   60
Output: 4

Your Task:
You need to complete the function diameter() that takes root as parameter and returns the diameter.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 <= Number of nodes <= 10000
1 <= Data of a node <= 1000
*/

// Kashif Iqbal
// 26-May-2021	


class Solution 
{
    int height(Node root){
        
        if(root == null){
            return 0;
        }
        
       return (1 + Math.max(height(root.left) , height(root.right)));
    }
    
    int diameter(Node root){
        
        if(root == null){
            return 0;
        }
        
        int additionOfHeights =  height(root.left) + height(root.right) + 1;
        int leftDiameter = diameter(root.left);
        int rightDiameter = diameter(root.right);
        
        return Math.max(additionOfHeights, Math.max(leftDiameter , rightDiameter));
    }
}

