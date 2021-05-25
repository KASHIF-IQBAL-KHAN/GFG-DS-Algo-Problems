/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Tree of size N and an integer K. Print all nodes that are at distance k from root (root is considered at distance 0 from itself). Nodes should be printed from left to right. If k is more that height of tree, nothing should be printed.

For example, if below is given tree and k is 2. Output should be 4 5 6.

          1
       /     \
     2        3
   /         /   \
  4        5    6 
     \
      8

Example 1:

Input:
K = 0
      1
    /   \
   3     2
Output: 1

Example 2:

Input:
K = 3
        3
       /
      2
       \
        1
      /  \
     5    3
Output: 5 3
Your Task:
You don't have to take input. Complete the function Kdistance() that accepts root node and k as parameter and return the value of the nodes that are at a distance k from the root. (The values are returned as vector in cpp, as ArrayList in java and list in python)
Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1 <= N <= 104
0 <= K <= 30
*/

// Kashif Iqbal
// 24-May-2021	

class Tree
{
     
     ArrayList<Integer> Kdistance(Node root, int k)
     {
         LinkedList<Node> queue = new LinkedList<>();
         ArrayList<Integer> list = new ArrayList<>();
         
         queue.add(root);
         int level = 0;
         
         while(!queue.isEmpty()){
             
             int size = queue.size();
             
             if(k == level){
                 while(!queue.isEmpty()){
                     list.add(queue.pollFirst().data);
                 }
                 break;
             }
             
             level = level + 1;
             
             while(size > 0){
                 Node temp = queue.pollFirst();
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


//Recursive

class Tree
{
    void helperMethod(Node temp , int k , ArrayList<Integer> list){
        
        if(temp == null){
            return;
        }
        
        if(k == 0){
            list.add(temp.data);
        }
        
        helperMethod(temp.left , k-1 , list);
        helperMethod(temp.right , k-1 , list);
    }
    
    ArrayList<Integer> Kdistance(Node root, int k){
        
        ArrayList<Integer> list = new ArrayList<>();
        helperMethod(root , k , list);
        return list;
        
    }
}

