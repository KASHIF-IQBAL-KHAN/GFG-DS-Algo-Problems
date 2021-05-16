/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a string S, check if it is palindrome or not.

Example 1:

Input: S = "abba"
Output: 1
Explanation: S is a palindrome
Example 2:

Input: S = "abc" 
Output: 0
Explanation: S is not a palindrome
 

Your Task:  
You don't need to read input or print anything. Complete the function isPlaindrome() which accepts string S and returns a boolean value


Expected Time Complexity: O(Length of S) 
Expected Auxiliary Space: O(1) 


Constraints:
1 <= Length of S <= 105
*/

// Kashif Iqbal
// 16-May-2021	

class Solution {
    
    int isPlaindrome(String S) {
        
        int answer = 1;
        
        for(int itr = 0; itr < S.length()/2; ++itr){
            if((S.charAt(itr) != S.charAt(S.length() - itr - 1))){
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
};