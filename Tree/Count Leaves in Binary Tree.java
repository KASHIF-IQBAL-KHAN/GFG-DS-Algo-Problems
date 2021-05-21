/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
Given a Binary Tree of size N , You have to count leaves in it. For example, there are two leaves in following tree

        1
     /    \
   10      39
  /
5

Example 1:

Input:

Given Tree is 
               4
             /   \
            8     10
           /     /   \
          7     5     1
         /
        3 
Output:
3

Explanation: 
Three leaves are 3 , 5 and 1.

Your Task:
You don't have to take input. Complete the function countLeaves() that takes root node of given tree as parameter and
returns the count of leaves in tree . The printing is done by the driver code.

Constraints:
1<= N <= 104

Note:The Input/Ouput format and Example given below is used for system's internal purpose, and should be used by a 
user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console, 
and should not print anything on stdout/console. The task is to complete the function specified, 
and not to write the full code
*/

// Kashif Iqbal
// 21-May-2021	

//Iterative

class Tree
{
    int countLeaves(Node root){
        
        LinkedList<Node> list = new LinkedList<>();
        list.add(root);
        int leavesCount = 0;
        
        while(!list.isEmpty()){
            
            Node ptr = list.pollFirst();
            
            if(ptr.left == null && ptr.right == null){
                leavesCount = leavesCount + 1;
            }
            
            if(ptr.left != null){
                list.add(ptr.left);
            }
            
            if(ptr.right != null){
                list.add(ptr.right);
            }
            
        }
        
        return leavesCount;
    }
}


//Recursive 

class Tree
{

    int helperMethod(Node ptr , int count){
        
        if(ptr == null){
            return 0;
        }
        
        if(ptr.left == null && ptr.right == null){
            return 1;   
        }
        
        return helperMethod(ptr.left , count) + helperMethod(ptr.right , count);
    }
    
    int countLeaves(Node node) 
    {
        
        int count = 0;
        
        count = helperMethod(node , count);
        
        return count;
         
    }
}    
