/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Tree, convert it into its mirror.

Example 1:

Input:
      1
    /  \
   2    3

Output: 2 1 3

Explanation: The tree is
   1    (mirror)  1
 /  \    =>      /  \
3    2          2    3
The inorder of mirror is 2 1 3
Example 2:

Input:
      10
     /  \
    20   30
   /  \
  40  60
Output: 30 10 60 20 40

Explanation: The tree is

      10               10
    /    \  (mirror) /    \
   20    30    =>   30    20
  /  \                   /   \
 40  60                 60   40
The inroder traversal of mirror is
30 10 60 20 40.

Your Task:
Just complete the function mirror() that takes node as paramter  and convert it into its mirror. The printing is done by the driver code only.
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 <= Number of nodes <= 105
1 <= Data of a node <= 105
*/

// Kashif Iqbal
// 20-May-2021	

//Iterative

class Solution
{
    //Function to convert a binary tree into its mirror tree.
    void mirror(Node node)
    {
        Queue<Node> queue = new LinkedList<>();
        
        queue.add(node);
        
        while(!queue.isEmpty()){
            Node ptr = queue.poll();
            
            if(ptr.left != null){
                queue.add(ptr.left);
            }
            
            if(ptr.right != null){
                queue.add(ptr.right);
            }
            
            Node temp = ptr.left;
            ptr.left = ptr.right;
            ptr.right = temp;
        }
    }
}

//Recursive

class Solution
{
    //Function to convert a binary tree into its mirror tree.
    void mirror(Node node)
    {
        if(node == null){
            return;
        }
        
        mirror(node.left);    
        mirror(node.right);
        
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
