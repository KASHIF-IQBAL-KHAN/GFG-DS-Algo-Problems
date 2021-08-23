/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Tree, find Right view of it. Right view of a Binary Tree is set of nodes visible when tree is viewed from right side.

Right view of following tree is 1 3 7 8.

          1
       /     \
     2        3
   /   \      /    \
  4     5   6    7
    \
     8

Example 1:

Input:
       1
    /    \
   3      2
Output: 1 2

Example 2:

Input:
     10
    /   \
  20     30
 /   \
40  60 
Output: 10 30 60

Your Task:
Just complete the function rightView() that takes node as parameter and returns the right view as a list. 

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 ≤ Number of nodes ≤ 105
1 ≤ Data of a node ≤ 105
*/

// Kashif Iqbal
// 23-Aug-2021	

class Solution{
    
    int maxLevel = 0;
    
    void helper(Node node , ArrayList<Integer> list, int level){
        if(node == null){
            return;
        }
        
        if(maxLevel < level){
            list.add(node.data);
            maxLevel = level;
        }
        
        helper(node.right,list,level+1);
        helper(node.left,list,level+1);
    }
    
    ArrayList<Integer> rightView(Node node) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        helper(node , list,1);
        
        return list;
        
        
    }
}

