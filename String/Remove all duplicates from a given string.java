/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a string Str which may contains lowercase and uppercase chracters. The task is to remove all duplicate characters from the string and find the resultant string. The order of remaining characters in the output should be same as in the original string.

Example 1:

Input:
Str = geeksforgeeks
Output: geksfor
Explanation: After removing duplicate
characters such as e, k, g, s, we have
string as "geksfor".

Example 2:

Input:
Str = HappyNewYear
Output: HapyNewYr
Explanation: After removing duplicate
characters such as p, e, a, we have
string as "HapyNewYr".
Your Task:
Complete the function removeDuplicates() which takes a string str, as input parameters and returns a string denoting the answer. You don't to print answer or take inputs.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 ≤ N ≤ 105
String contains uppercase and lowercase english letters.

 */

// Kashif Iqbal
// 16-May-2021	

class Solution {
    String removeDuplicates(String str) {
        
        java.util.LinkedHashSet<Character> list = new java.util.LinkedHashSet<>();
        
        StringBuilder sb = new StringBuilder();
        
        for(int itr = 0; itr < str.length(); ++itr){
            if(!list.contains(str.charAt(itr))){
                list.add(str.charAt(itr));
                sb.append(str.charAt(itr));
            }
        }
        
        return sb.toString();
    }
}

