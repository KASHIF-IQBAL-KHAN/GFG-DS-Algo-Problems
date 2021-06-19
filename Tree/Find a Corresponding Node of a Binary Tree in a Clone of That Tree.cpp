/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by LeetCode's Online Judge.*/
/*
// @author Kashif Iqbal
// @since 02-Jan-2020



/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {

public:
    TreeNode* foundNode = nullptr;

    void DFS(TreeNode* original, TreeNode* cloned, int searchValue){
        
	if(original == nullptr){
            return;
        }   
        if(cloned->val == searchValue){
            foundNode = cloned;
            return;
        }    
        
        DFS(original->left , cloned->left , searchValue);
        DFS(original->right , cloned->right , searchValue);
    }
    
    TreeNode* getTargetCopy(TreeNode* original, TreeNode* cloned, TreeNode* target) {
        DFS(original , cloned , target->val);
        return foundNode;   
    }
};


