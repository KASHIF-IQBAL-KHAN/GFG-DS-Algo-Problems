/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a string S consisting of only opening and closing curly brackets '{' and '}', find out the minimum number of reversals required to convert the string into a balanced expression.
A reversal means changing '{' to '}' or vice-versa.

Example 1:

Input:
S = "}{{}}{{{"
Output: 3
Explanation: One way to balance is: "{{{}}{}}". There is no balanced sequence that can be formed in lesser reversals.

Example 2:

Input: 
S = "{{}{{{}{{}}{{"
Output: -1
Explanation: There's no way we can balance this sequence of braces.

Your Task:
You don't need to read input or print anything. Your task is to complete the function countRev() which takes the string S as input parameter and returns the minimum number of reversals required to balance the bracket sequence. If balancing is not possible, return -1. 

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 ≤ |S| ≤ 105
*/

// Kashif Iqbal
// 23-July-2021	

class Sol {
    int countRev(String s) {

        if ((s.length() % 2) != 0) {
            return -1;
        }

        int count = 0;
        int reversals = 0;

        for (int itr = 0; itr < s.length(); ++itr) {
            if (s.charAt(itr) == '{') {
                ++count;
            } else if (s.charAt(itr) == '}') {
                if (count > 0) {
                    --count;
                } else {
                    ++count;
                    ++reversals;
                }
            }
        }

        return reversals + (count / 2);
    }
}