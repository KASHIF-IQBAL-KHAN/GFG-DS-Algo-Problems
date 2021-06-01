/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Tree of size N, extract all its leaf nodes to form a Doubly Link List strating from the left most leaf. 
Modify the original tree to make the DLL thus removing the leaf nodes from the tree. Consider the left and right pointers 
of the tree to be the previous and next pointer of the DLL respectively.

Example 1:

Input :
        1
      /   \
     2     3
    / \   / \
   4   5 6   7    

Output: 
Modified Tree :
        1
      /   \
     2     3

Doubly Link List :
4 <-> 5 <-> 6 <-> 7

Explanation:
The leaf nodes are modified to form the DLL 
in-place. Thus their links are removed from 
the tree.
Example 2:

Input :
        1
      /   \
     2     3
    / \   
   4   5 

Output: 
Modified Tree :
        1
      /   
     2    

Doubly Link List :
4 <-> 5 <-> 3

Your Task:  
You dont need to read input or print anything. Complete the function convertToDLL() which takes root of the given tree as input parameter and returns the head of the doubly link list.

Note:
The generated output will contain the inorder traversal of the modified tree, the DLL from left to right and the DLL from right to left.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(height of tree)

Constraints:
1 ≤ N ≤ 10^4
*/

// Kashif Iqbal
// 2-June-2021	

class Tree{
    
    void leafNodes(Node root, ArrayList<Integer> list) {
        
        if(root == null){
            return;
        }
        
        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                list.add(root.left.data);
                root.left = null;
            }
        }
        
        leafNodes(root.left,list);
        
        if(root.right != null){
            if(root.right.left == null && root.right.right == null){
                list.add(root.right.data);
                root.right = null;
            }
        }
        
        leafNodes(root.right,list);
    }
    
    public Node convertToDLL(Node root) {
         
        ArrayList<Integer> list = new ArrayList<>();
        leafNodes(root, list);
        Node head = null;
        Node tail = null;
         
        for(int itr : list) {  
            Node temp = new Node(itr);
             
            if(head == null) {
                head = temp;
                tail = head;
            }
             
            else {
                tail.right = temp;
                temp.left = tail;
                tail = temp;
            }
        }
         
        return head;
    }
}
