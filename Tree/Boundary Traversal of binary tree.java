/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Tree, find its Boundary Traversal. The traversal should be in the following order: 

Left boundary nodes: defined as the path from the root to the left-most node ie- the leaf node you could reach when you always travel preferring the left subtree over the right subtree. 

Leaf nodes: All the leaf nodes except for the ones that are part of left or right boundary.

Reverse right boundary nodes: defined as the path from the right-most node to the root. The right-most node is the leaf node you could reach when you always travel preferring the right subtree over the left subtree. Exclude the root from this as it was already included in the traversal of left boundary nodes.

Note: If the root doesn't have a left subtree or right subtree, then the root itself is the left or right boundary. 

Example 1:

Input:
        1
      /   \
     2     3    
   
Output: 1 2 3

Example 2:

Input:
          20
        /   \
       8     22
     /   \    \
    4    12    25
        /  \ 
       10   14 

Output: 20 8 4 10 14 25 22

Your Task:

This is a function problem. You don't have to take input. Just complete the function printBoundary() that takes the root node as input and returns an array containing the boundary values in anti-clockwise.

Expected Time Complexity: O(N). 
Expected Auxiliary Space: O(Height of the Tree).

Constraints:

1 ≤ Number of nodes ≤ 105
1 ≤ Data of a node ≤ 105
*/

// Kashif Iqbal
// 27-May-2021	

class Solution{
    
     void leftNodes(Node ptr , ArrayList<Integer> list){
        
        if(ptr == null){
            return;
        }
        
        if(ptr.left != null || ptr.right != null){
            list.add(ptr.data);
        }
        
        if(ptr.left != null){
            leftNodes(ptr.left , list);
        }
        
        else if(ptr.right != null){
            leftNodes(ptr.right , list);
        }
        
    }
    
    void leafNodes(Node ptr , ArrayList<Integer> list){
        
        if(ptr == null){
            return;
        }
        
        leafNodes(ptr.left , list);
        leafNodes(ptr.right , list);
        
        if(ptr.left == null && ptr.right == null){
            list.add(ptr.data);
        }
    }
    
    void rightNodes(Node ptr , ArrayList<Integer> list){
      
        if(ptr == null){
            return;
        }
        
        if(ptr.right != null){
            rightNodes(ptr.right , list);
        }
        
        else if(ptr.left != null){
            rightNodes(ptr.left , list);
        }
        
        if(ptr.left != null || ptr.right != null){
            list.add(ptr.data);
        }
        
    }
    
	ArrayList <Integer> printBoundary(Node node){
	    
	    ArrayList<Integer> list = new ArrayList<>();
	    
	    if(node == null){
		return list;    
	    }
	    
	    list.add(node.data);
	    
	    leftNodes(node.left , list);
	    leafNodes(node , list);
	    rightNodes(node.right , list);
	    
	    return list;
	}
}
