/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Tree of size N. Find the sum of all the leaf nodes that are left child of their parent of the given binary tree.

Example 1:

Input:
       1
     /   \
    2     3
    
Output: 2

Example 2:

Input : 
         1
        /  \
       2    3
     /  \     \
    4    5     8 
  /  \        /  \
 7    2      6    9
 
Output: 13

Explanation:

sum = 6 + 7 = 13

Your Task:

You don't need to read input or print anything. Your task is to complete the function leftLeavesSum() which takes the root node of the tree as input and returns the sum of all the left leaf nodes present in the given binary tree.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1<=Number of nodes<=105
*/

// Kashif Iqbal
// 24-May-2021	


class Solution{
    
    int helperMethod(Node temp , int sum){
        
        if(temp == null){
            return 0;
        }
        
        if(temp.left != null){ 
            if(temp.left.left == null && temp.left.right == null){
                return temp.left.data + helperMethod(temp.right , sum);
            }
        }
        
        return helperMethod(temp.left , sum) + helperMethod(temp.right , sum);
    }
    
    public int leftLeavesSum(Node root){ 
        int sum = 0;
        sum = helperMethod(root , sum);
        return sum;
    } 
}

