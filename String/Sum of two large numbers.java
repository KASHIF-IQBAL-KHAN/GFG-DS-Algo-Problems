/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given two strings denoting non-negative numbers X and Y. Calculate the sum of X and Y.

Example 1:

Input:
X = "25", Y = "23"
Output:
48
Explanation:
The sum of 25 and 23 is 48.

Example 2:

Input:
X = "2500", Y = "23"
Output:
2523
Explanation:
The sum of 2500 and 23 is 2523.

Your Task:
Your task is to complete the function findSum() which takes two strings as inputs and returns the string without leading zeros. You do not need to take any input or print anything.

Expected Time Complexity: O(|X| + |Y|)
Expected Auxiliary Space: O(1)


Constraints:
1 <= |X|, |Y| <= 105
*/

// Kashif Iqbal
// 24-July-2021	

class Solution {
    String findSum(String X, String Y) {

        String res = "";
        int carry = 0;
        int sum = 0;
        int xLength = X.length() - 1;
        int yLength = Y.length() - 1;

        while (xLength >= 0 && yLength >= 0) {
            sum = ((X.charAt(xLength) - '0') + (Y.charAt(yLength) - '0') + carry) % 10;
            carry = ((X.charAt(xLength) - '0') + (Y.charAt(yLength) - '0') + carry) / 10;
            res = sum + res;
            --xLength;
            --yLength;
        }

        while (xLength >= 0) {
            sum = ((X.charAt(xLength) - '0') + carry) % 10;
            carry = ((X.charAt(xLength) - '0') + carry) / 10;
            res = sum + res;
            --xLength;
        }

        while (yLength >= 0) {
            sum = ((Y.charAt(yLength) - '0') + carry) % 10;
            carry = ((Y.charAt(yLength) - '0') + carry) / 10;
            res = sum + res;
            --yLength;
        }

        if (carry != 0) {
            res = carry + res;
        }

        for (int itr = 0; itr < res.length(); ++itr) {
            if (res.charAt(itr) != '0') {
                return res.substring(itr);
            }
        }
        return "0";
    }
}