/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given an array Arr of N positive integers, find K largest elements from the array.  The output elements should be printed in decreasing order.

Example 1:

Input:
N = 5, K = 2
Arr[] = {12, 5, 787, 1, 23}
Output: 787 23
Explanation: 1st largest element in the array is 787 and second largest is 23.

Example 2:

Input:
N = 7, K = 3
Arr[] = {1, 23, 12, 9, 30, 2, 50}
Output: 50 30 23
Explanation: 3 Largest element in the array are 50, 30 and 23.

Your Task:
You don't need to read input or print anything. Your task is to complete the function kLargest() which takes the array of integers arr, n and k as parameters and returns an array of integers denoting the answer. The array should be in decreasing order.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(K*logK)

Constraints:
1 ≤ K ≤ N ≤ 105
*/

// Kashif Iqbal
// 19-June-2021

class Solution {

  int[] kLargest(int[] arr, int n, int k) {
    int[] ansArr = new int[k];

    PriorityQueue<Integer> queue = new PriorityQueue<>(
      Collections.reverseOrder()
    );

    for (int itr = 0; itr < n; ++itr) {
      queue.add(arr[itr]);
    }

    for (int itr = 0; itr < k; ++itr) {
      int temp = queue.poll();
      ansArr[itr] = temp;
    }

    return ansArr;
  }
}
