/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a binary tree and an integer S, check whether there is root to leaf path with its sum as S.

Example 1:

Input:
Tree = 
            1
          /   \
        2      3
S = 2

Output: 0

Explanation:
There is no root to leaf path with sum 2.
Example 2:

Input:
Tree = 
            1
          /   \
        2      3
S = 4

Output: 1

Explanation:
The sum of path from leaf node 3 to root 1 is 4.

Your Task:  
You dont need to read input or print anything. Complete the function hasPathSum() which takes root node and target sum S as input parameter and returns true if path exists otherwise it returns false.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(height of tree)

Constraints:
1 ≤ N ≤ 10^4
1 ≤ S ≤ 10^6
*/

// Kashif Iqbal
// 31-May-2021	

class Solution{
    
    void helperMethod(Node root , int sum , ArrayList<Integer> list){
        
        if(root == null){
            return;
        }
        
        sum = sum - root.data;
        helperMethod(root.left, sum, list);
        helperMethod(root.right, sum, list);
        
        if(root.left == null && root.right == null && sum == 0){
            list.add(1);
        }
    }

    boolean hasPathSum(Node root, int S){
        
        ArrayList<Integer> list = new ArrayList<>();
        helperMethod(root, S, list);
        
        if(list.isEmpty()){
            return false;
        }
        
        return true;
    }
}