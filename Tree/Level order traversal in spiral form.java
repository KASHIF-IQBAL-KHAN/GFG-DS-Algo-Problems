/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Complete the function to find spiral order traversal of a tree. For below tree, function should return 1, 2, 3, 4, 5, 6, 7.

Example 1:

Input:
      1
    /   \
   3     2
Output:1 3 2

Example 2:

Input:
           10
         /     \
        20     30
      /    \
    40     60
    
Output: 10 20 30 60 40 

Your Task:

The task is to complete the function findSpiral() which takes root node as input parameter and returns the elements in spiral form of level order traversal as a list. The newline is automatically appended by the driver code.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
0 <= Number of nodes <= 105
0 <= Data of a node <= 105
*/

// Kashif Iqbal
// 26-May-2021	

class Spiral{

    ArrayList<Integer> findSpiral(Node root){
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        
        LinkedList<Node> queue = new LinkedList<>();
        LinkedList<Node> stack = new LinkedList<>();
        
        queue.add(root);
        int level = 0;
        
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
                    list.add(stack.pollLast().data);
                }
                else{
                    list.add(stack.pollFirst().data);
                }
            }
            
            level = level + 1;
        }
        
        return list;
    }
}
