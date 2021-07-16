/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

For a given number N check if it is prime or not. A prime number is a number which is only divisible by 1 and itself.
 
Example 1:

Input:
N = 5
Output:
1
Explanation:
5 has 2 factors 1 and 5 only.

Example 2:

Input:
N = 25
Output:
0
Explanation:
25 has 3 factors 1, 5, 25

Your Task:
You don't need to read input or print anything. Your task is to complete the function isPrime() which takes an integer N as input parameters and returns an integer, 1 if N is a prime number or 0 otherwise.

Expected Time Complexity: O(sqrt(N))
Expected Space Complexity: O(1)

Constraints:
1 <= N <= 109
*/

//  Kashif Iqbal
//  16-July-2021
 
class Solution {
    static int isPrime(int N) {
        if (N <= 1) {
            return 0;
        }

        for (int itr = 2; itr <= Math.sqrt(N); ++itr) {
            if (N % itr == 0) {
                return 0;
            }
        }
        return 1;
    }
}