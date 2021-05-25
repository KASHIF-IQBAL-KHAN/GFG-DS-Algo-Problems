/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a binary tree, find the largest value in each level.

Example 1:

Input :
        1
       / \
      2   3 

Output : 1 3

Explanation : 
There are two levels in the tree :
1. {1}, max = 1
2. {2, 3}, max = 3

Example 2:

Input :
        4
       / \
      9   2
     / \   \
    3   5   7 

Output : 4 9 7

Explanation : 
There are three levels in the tree:
1. {4}, max = 4
2. {9, 2}, max = 9
3. {3, 5, 7}, max=7

Your task :
You don't need to read input or print anything. Your task is to complete the function largestValues() which takes the root node of the tree as input and returns a vector containing the largest value in each level. 
 
Expected Time Complexity : O(n) , where n = number of nodes
Expected Auxiliary Space : O(n) , where n = number of nodes
 
Constraints : 
1 ≤ Number of nodes ≤ 10^5
*/

// Kashif Iqbal
// 20-May-2021	

class Solution
{
    public ArrayList<Integer> largestValues(Node root)
    {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int max = 0;
            int size = queue.size();
            
            while(size > 0){
                
                Node ptr = queue.poll();
                
                if(max < ptr.data){
                    max = ptr.data;
                }
                
                if(ptr.left != null){
                    queue.add(ptr.left);
                }
                
                if(ptr.right != null){
                    queue.add(ptr.right);
                }
                size--;
            }
            
            list.add(max);
        }
        
        return list;
    }
}