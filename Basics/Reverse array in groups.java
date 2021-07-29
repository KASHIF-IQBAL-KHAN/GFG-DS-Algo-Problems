/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements 1, 2, 3. Second group consists of 4,5.

Example 2:

Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9

Your Task:
You don't need to read input or print anything. The task is to complete the function reverseInGroups() which takes the array, N and K as input parameters and modifies the array in-place. 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N, K ≤ 107
1 ≤ A[i] ≤ 1018
*/

//  Kashif Iqbal
//  29-july-2021
 
class Solution {
    
    void reverse(int low, int high, ArrayList<Integer> arr){
        for(int itr = low; itr < high; ++itr){
            int temp = arr.get(itr);
            arr.set(itr, arr.get(high));
            arr.set(high, temp);
            --high;
        }
    }
    
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        for(int itr = 0; itr < n; itr = itr + k){
            if((itr+k) > (n-1)){
                reverse(itr , n-1,arr);
            } else {
                reverse(itr,itr + k-1,arr);
            }
        }
    }
}