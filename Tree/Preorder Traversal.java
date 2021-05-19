/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a binary tree, find its preorder traversal.

Example 1:

Input:
        1      
      /          
    4    
  /    \   
4       2
Output: 1 4 4 2 
Example 2:

Input:
       6
     /   \
    3     2
     \   / 
      1 2
Output: 6 3 1 2 2 

Your Task:
You just have to complete the function preorder() which takes the root node of the tree as input and returns an array containing the preorder traversal of the tree.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= Number of nodes <= 104
1 <= Data of a node <= 10
*/

// Kashif Iqbal
// 19-May-2021	

class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    
    static void helperMethod(Node ptr , ArrayList<Integer> list){
        if(ptr == null){
            return;
        }
        
        list.add(ptr.data);
        helperMethod(ptr.left , list);
        helperMethod(ptr.right , list);
    }
    
    static ArrayList<Integer> preorder(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        helperMethod(root , list);
        return list;
    }
    
}