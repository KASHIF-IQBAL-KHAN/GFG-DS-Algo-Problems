/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Search Tree. The task is to find the minimum element in this given BST.

Example 1:

Input:
           5
         /    \
        4      6
       /        \
      3          7
     /
    1
Output: 1

Example 2:

Input:
             9
              \
               10
                \
                 11
Output: 9

Your Task:
The task is to complete the function minValue() which takes root as the argument and returns the minimum element of BST. If the tree is empty, there is no minimum elemnt, so retutn -1 in that case.

Expected Time Complexity: O(Height of the BST)
Expected Auxiliary Space: O(Height of the BST).

Constraints:
1 <= N <= 104
*/

// Kashif Iqbal
// 20-July-2021	

//Iterative

class Tree {
    int minValue(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.data;
    }
}

//Recursive 

class Tree {
    int minValue(Node node) {
        if (node.left != null) {
            return minValue(node.left);
        }
        return node.data;
    }
}