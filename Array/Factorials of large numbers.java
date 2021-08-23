/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given an integer N, find its factorial.

Example 1:

Input: N = 5
Output: 120
Explanation : 5! = 1*2*3*4*5 = 120

Example 2:

Input: N = 10
Output: 3628800
Explanation :
10! = 1*2*3*4*5*6*7*8*9*10 = 3628800

Your Task:
You don't need to read input or print anything. Complete the function factorial() that takes integer N as input parameter and returns a list of integers denoting the digits that make up the factorial of N.

Expected Time Complexity : O(N2)
Expected Auxilliary Space : O(1)

Constraints:
1 ≤ N ≤ 1000
*/

//  Kashif Iqbal
//  15-August-2021

 class Solution {
    static ArrayList < Integer > factorial(int N) {
        ArrayList < Integer > fact = new ArrayList < > ();
        fact.add(1);
        for (int i = 1; i <= N; i++) {
            int carry = 0;
            int num = 0;
            for (int j = fact.size() - 1; j >= 0; j--) {
                int d = fact.get(j);
                int prod = d * i + carry;
                num = prod % 10;
                carry = prod / 10;
                fact.set(j, num);
            }
            while (carry != 0) {
                fact.add(0, carry % 10);
                carry = carry / 10;
            }
        }
        return fact;
    }
}