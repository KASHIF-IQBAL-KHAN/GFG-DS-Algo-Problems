/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

Example 1:

Input:
N = 5
arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.

Example 2:

Input:
N = 4
arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 of element (-1)

Your Task:
You don't need to read input or print anything. The task is to complete the function maxSubarraySum() which takes arr
and N as input parameters and returns the sum of subarray with maximum sum.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 106
-107 ≤ A[i] ≤ 107
*/

//  Kashif Iqbal
//  30-May-2021
 
class Solution{

    int maxSubarraySum(int arr[], int n){
        
        int sum = 0;
        int maxSubArraySum = Integer.MIN_VALUE;
        
        for(int itr = 0; itr < n; ++itr){
            sum = sum + arr[itr];
            if(sum > maxSubArraySum){
                maxSubArraySum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
            
        return maxSubArraySum;
    }
}