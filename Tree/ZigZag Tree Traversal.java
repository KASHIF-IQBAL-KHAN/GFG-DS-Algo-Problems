/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Tree. Find the Zig-Zag Level Order Traversal of the Binary Tree.

Example 1:

Input:
        3
      /   \
     2     1
Output:
3 1 2
Example 2:

Input:
           7
        /     \
       9       7
     /  \     /   
    8    8   6     
   /  \
  10   9 
  
Output:
7 7 9 8 8 6 9 10 
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function zigZagTraversal() which takes the root node of the Binary Tree as its input and returns a list containing the node values as they appear in the Zig-Zag Level-Order Traversal of the Tree.


Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 104
*/

// Kashif Iqbal
// 24-May-2021	

class GFG{
    
	ArrayList<Integer> zigZagTraversal(Node root){
	    
	    ArrayList<Integer> list = new ArrayList<>();
	    LinkedList<Node> queue = new LinkedList<>();
	    LinkedList<Node> stack = new LinkedList<>();
	    
	    int level = 0;
	    
	    queue.add(root);
	    
	    while(!queue.isEmpty()){
	        
	        int size = queue.size();
	        
	        while(size > 0){
	            
	            Node temp = queue.pollFirst();
	            stack.add(temp);
	            
                if(temp.left != null){
                    queue.add(temp.left);
	        }
                    
                if(temp.right != null){    
                    queue.add(temp.right);
            	}
	            
                size = size - 1;
            }
                
            while(!stack.isEmpty()){
                
                if(level % 2 == 0){
                    list.add(stack.pollFirst().data);
                }
                
                else{
                    list.add(stack.pollLast().data);
                }
                
            }
            
            level =  level + 1;
        }
        
    return list;
    }
}
