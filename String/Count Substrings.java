/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a binary string S. The task is to count the number of substrings that starts and end with 1.
Note: The starting and the ending 1s should be different.

Example 1:

Input:
S = "10101"
Output: 3
Explanation: The 3 substrings are "101",
"10101" and "101".

Example 2:

Input: 
S = "100"
Output: 0
Explanation: No substring that starts and
ends with 1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function countSubstr() which takes the string S as input and returns the count of the substrings that start and end with 1.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(1).

Constraints:
1 <= |S| <= 1000
*/

// Kashif Iqbal
// 16-May-2021	

class Solution
{
    int countSubstr (String S)
    {
        int count = 0;
	    
	    for(int itr = 0; itr < S.length(); ++itr){
	        if(S.charAt(itr) == '1'){
	            ++count;
	        }
        }
 
        int ans = (count * (count-1)) / 2;
        
	    return ans;       
    }
}