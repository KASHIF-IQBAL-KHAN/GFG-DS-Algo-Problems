/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.

Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with sum 0 will be -2 2 -8 1 7.

Your Task:
You just have to complete the function maxLen() which takes two arguments an array A and n, where n is the size of the array A and returns the length of the largest subarray with 0 sum.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 105
-1000 <= A[i] <= 1000, for each valid i
*/

//  Kashif Iqbal
//  09-Sep-2021
 
class GfG {
    int maxLen(int arr[], int n) {
        int sum = 0;
        int maxLen = 0;

        HashMap < Integer, Integer > map = new HashMap < > ();

        for (int itr = 0; itr < n; ++itr) {

            sum = sum + arr[itr];

            if (arr[itr] == 0 && maxLen == 0) {
                maxLen = 1;
            }

            if (sum == 0) {
                maxLen = itr + 1;
            }

            if (!map.containsKey(sum)) {
                map.put(sum, itr);
            } else {
                int index = itr - map.get(sum);
                if (index > maxLen) {
                    maxLen = index;
                }
            }
        }
        return maxLen;
    }
}