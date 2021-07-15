/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
You are given an integer N. You need to convert all zeroes of N to 5.

Example 1:

Input:
N = 1004
Output: 1554
Explanation: There are two zeroes in 1004 on replacing all zeroes with "5", the new number will be "1554".

Example 2:

Input:
N = 121
Output: 121
Explanation: Since there are no zeroes in "121", the number remains as "121".

Your Task:
Your task is to complete the function convertFive() which takes an integer N as an argument and replaces all zeros in the number N with 5. Your function should return the converted number.

Expected Time Complexity: O(K) where K is the number of digits in N
Expected Auxiliary Space: O(1)

Constraints:
1 <= n <= 10000
*/

//  Kashif Iqbal
//  15-July-2021

class GfG {
    int convertfive(int num) {

        int r = 0;
        int k = 0;
        int newNum = 0;

        while (num > 0) {
            r = num % 10;
            if (r == 0) {
                r = 5;
            }
            newNum = newNum + (r * (int) Math.pow(10, k));
            k++;
            num = num / 10;
        }
        return newNum;
    }
}

//Recursion

class GfG {
    int convertfiveRec(int num) {
        // Base case for recursion termination
        if (num == 0) return 0;

        // Extract the last digit and change it if needed
        int digit = num % 10;
        if (digit == 0) digit = 5;

        // Convert remaining digits and append the last digit
        return convertfiveRec(num / 10) * 10 + digit;
    }
    int convertfive(int num) {
        if (num == 0)
            return 5;
        else
            return convertfiveRec(num);
    }
}
