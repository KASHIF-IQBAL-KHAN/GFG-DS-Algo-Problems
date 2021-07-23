/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a Binary Search Tree of size N, find the Median of its Node values.

Example 1:

Input:
       6
     /   \
   3      8   
 /  \    /  \
1    4  7    9
Output: 6

Explanation: Inorder of Given BST will be:
1, 3, 4, 6, 7, 8, 9. So, here median will 6.

Example 2:

Input:
       6
     /   \
   3      8   
 /   \    /   
1    4   7   
Output: 5

Explanation:Inorder of Given BST will be:
1, 3, 4, 6, 7, 8. So, here median will (4 + 6)/2 = 10/2 = 5.
 
Your Task:
You don't need to read input or print anything. Your task is to complete the function findMedian() which takes the 
root of the Binary Search Tree as input and returns the Median of Node values in the given BST.

Median of the BST is:
If number of nodes are even: then median = (N/2 th node + (N/2)+1 th node)/2
If number of nodes are odd : then median = (N+1)/2th node.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Height of the Tree).

Constraints:
1<=N<=1000
*/

// Kashif Iqbal
// 22-July-2021	

//Iterative

class Tree {

    static void inOrder(Node root, ArrayList < Integer > list) {
        if (root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }

    public static void findMedian(Node root) {
        ArrayList < Integer > list = new ArrayList < > ();
        inOrder(root, list);
        int size = list.size();
        if (size % 2 == 0) {
            if ((list.get(size / 2) + list.get((size / 2) - 1)) % 2 == 0) {
                System.out.print((list.get(size / 2) + list.get((size / 2) - 1)) / 2);
            } else {
                System.out.print((list.get(size / 2) + list.get((size / 2) - 1)) / 2.0);
            }
        } else {
            System.out.print(list.get(size / 2));
        }
    }

}