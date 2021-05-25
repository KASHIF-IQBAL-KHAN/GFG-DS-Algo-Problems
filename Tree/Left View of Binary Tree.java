/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Tree, print Left view of it. Left view of a Binary Tree is set of nodes visible when tree is visited from Left side. The task is to complete the function leftView(), which accepts root of the tree as argument.

Left view of following tree is 1 2 4 8.

          1
       /     \
     2        3
   /  \      / \
  4     5   6   7
   \
    8   

Example 1:

Input:
   1
 /  \
3    2
Output: 1 3

Example 2:

Input:

Output: 10 20 40

Your Task:
You just have to complete the function leftView() that prints the left view. The newline is automatically appended by the driver code.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
0 <= Number of nodes <= 100
1 <= Data of a node <= 1000

*/

// Kashif Iqbal
// 24-May-2021	

class Tree{
    
    ArrayList<Integer> leftView(Node root){
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        
        LinkedList<Node> queue = new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            Boolean flag = true;
            
            while(size > 0){
                
                Node temp = queue.pollFirst();
                
                if(flag == true){
                    list.add(temp.data);
                    flag = false;
                }
                
                if(temp.left != null){
                    queue.add(temp.left);
                }
                
                if(temp.right != null){
                    queue.add(temp.right);
                }
                
                size = size - 1;
            }
        }
            
        return list;
    }
}
