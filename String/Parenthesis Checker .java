/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

Example 1:
Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form balaced pairs, with 0 number of unbalanced bracket.

Example 2:
Input: 
()
Output: 
true
Explanation: 
(). Same bracket can form balanced pairs, and here only 1 type of bracket is present and in balanced way.

Example 3:
Input: 
([]
Output: 
false
Explanation: 
([]. Here square bracket is balanced but the small bracket is not balanced and Hence , the output will be unbalanced.

Your Task:
This is a function problem. You only need to complete the function ispar() that takes a string as a parameter and returns a boolean value true if brackets are balanced else returns false. The printing is done automatically by the driver code.

Expected Time Complexity: O(|x|)
Expected Auixilliary Space: O(|x|)

Constraints:
1 ≤ |x| ≤ 32000

Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".
Constraints:
1<=length of str<=100
*/

// Kashif Iqbal
// 18-July-2021	

class Solution {
    static boolean ispar(String x) {

        LinkedList < Character > stack = new LinkedList < > ();

        for (int itr = 0; itr < x.length(); ++itr) {
            
            if (x.charAt(itr) == '{' || x.charAt(itr) == '[' || x.charAt(itr) == '(') {
                stack.addLast(x.charAt(itr));
                
            } else if (stack.isEmpty()) {
                return false;
                
            } else {
                char value = stack.pollLast();
                if ((value == '[' && x.charAt(itr) != ']') ||
                    (value == '(' && x.charAt(itr) != ')') ||
                    (value == '[' && x.charAt(itr) != ']')) {
                    return false;
                }
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}