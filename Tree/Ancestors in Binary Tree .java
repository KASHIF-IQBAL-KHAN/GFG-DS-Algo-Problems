/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Tree and a target key, you need to find all the ancestors of the given target key.

              1
            /   \
          2      3
        /  \
      4     5
     /
    7
Key: 7
Ancestor: 4 2 1

Example 1:

Input:
        1
      /   \
     2     3
	 
target = 2
Output: 1

Example 2:

Input:
         1
       /   \
      2     3
    /  \   /  \
   4    5 6    8
  /
 7
 
target = 7
Output: 4 2 1

Your Task:
Your task is to complete the function Ancestors() that finds all the ancestors of the key in the given binary tree.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(H).
Note: H is the height of the tree and this space is used implicitly for recursion stack.

Constraints:
1 <= N <= 1000
1<= data of node <= 10000
*/

// Kashif Iqbal
// 31-May-2021	

class Solution{
    
    static Boolean helperMethod(Node node, int target, ArrayList<Integer> list){
        
        if(node == null){
            return false;
        }
        
        if(node.data == target){
            return true;
        }
        
        if(helperMethod(node.left, target, list) || helperMethod(node.right, target, list)){
            list.add(node.data);
            return true;
        }
        
        return false;
    }
    
    public static ArrayList<Integer> Ancestors(Node root, int target){
        
        ArrayList<Integer> list = new ArrayList<>();
        helperMethod(root, target, list);
        
        return list;
    }
}