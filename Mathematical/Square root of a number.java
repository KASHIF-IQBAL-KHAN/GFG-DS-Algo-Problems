/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).

Example 1:
Input:
x = 5
Output: 2
Explanation: Since, 5 is not a perfect 
square, floor of square_root of 5 is 2.

Example 2:
Input:
x = 4
Output: 2
Explanation: Since, 4 is a perfect 
square, so its square root is 2.

Your Task:
You don't need to read input or print anything. The task is to complete the function floorSqrt() which takes x as the input parameter and return its square root.
Note: Try Solving the question without using sqrt Function.

Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ x ≤ 107
*/

//  Kashif Iqbal
//  14-July-2021
 
/*You are required to complete this function*/
// Function to find square root
// x: element to find square root

class Solution {
    long floorSqrt(long x) {
        
        long low = 1;
        long high = x;

        while (low <= high) {

            long mid = (low + high) / 2;

            if (mid * mid == x) {
                return mid;
            }

            if (mid * mid < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}