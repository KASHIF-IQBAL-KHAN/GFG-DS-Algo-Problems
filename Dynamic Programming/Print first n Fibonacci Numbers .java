/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a number N, find the first N Fibonacci numbers. The first two number of the series are 1 and 1.

Example 1:

Input:
N = 5
Output: 1 1 2 3 5

Example 2:

Input:
N = 7
Output: 1 1 2 3 5 8 13

Your Task:
Your task is to complete printFibb() which takes single argument N and returns a list of first N Fibonacci numbers.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
Note: This space is used to store and return the answer for printing purpose.

Constraints:
1<= N <=84
*/

//  Kashif Iqbal
//  15-July-2021

// Iterative Approach

class Solution
{
    public static long[] printFibb(int n) 
    {
        long[] fibSeries= new long[n];

        if(n >= 1){
            fibSeries[0] = 1;
        } 
        if(n >= 2){
          fibSeries[1] = 1;
        }

        long a = 1;
        long b = 1;

        for(int itr = 2; itr < n; ++itr){
            long c = a+b;
            fibSeries[itr] = c;
            a = b;
            b = c;
        }

        return fibSeries;
    }
}

// Using Dynamic Programming

class Solution {
    public static long[] printFibb(int n) {
        if (n == 1) {
            return new long[] {1};
        }

        long[] fibSeries = new long[n];

        fibSeries[0] = 1;
        fibSeries[1] = 1;

        for (int itr = 2; itr < n; ++itr) {
            fibSeries[itr] = fibSeries[itr - 1] + fibSeries[itr - 2];
        }

        return fibSeries;
    }
}