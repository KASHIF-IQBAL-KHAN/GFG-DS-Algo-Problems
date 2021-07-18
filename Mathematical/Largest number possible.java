/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given two numbers 'N' and 'S' , find the largest number that can be formed with 'N' digits and whose sum of digits should be equals to 'S'.

Example 1:
Input: N = 2, S = 9
Output: 90
Explaination: It is the biggest number with sum of digits equals to 9.

Example 2:
Input: N = 3, S = 20
Output: 992
Explaination: It is the biggest number with sum of digits equals to 20.

Your Task:
You do not need to read input or print anything. Your task is to complete the function findLargest() which takes N and S as input parameters and returns the largest possible number. Return -1 if no such number is possible.

Expected Time Complexity: O(N)
Exepcted Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 104
1 ≤ S ≤ 105
*/

//  Kashif Iqbal
//  18-July-2021

class Solution {
    static String findLargest(int N, int S) {

        if (N > 1 && S == 0) {
            return "-1";
        }

        String ans = "";

        for (int itr = 0; itr < N; ++itr) {
            if (S >= 9) {
                ans = ans + 9;
            } else if (S > 0) {
                ans = ans + S;
            } else {
                ans = ans + 0;
            }
            S = S - 9;
        }

        if (S > 0) {
            return "-1";
        }

        return ans;
    }
}