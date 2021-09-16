/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a string S of lowercase alphabets, check if it is isogram or not. An Isogram is a string in which no letter occurs more than once.

Example 1:
Input:
S = machine
Output: 1
Explanation: machine is an isogram as no letter has appeared twice. Hence we print 1.

Example 2:
Input:
S = geeks
Output: 0
Explanation: geeks is not an isogram as 'e' appears twice. Hence we print 0.

Your Task:
This is a function problem. You only need to complete the function isIsogram() that takes a string as a parameter and returns either true or false.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(Number of distinct characters).
Note: N = |S|

Constraints:
1 <= |s| <= 103
*/

// Kashif Iqbal
// 18-July-2021
	
class Solution {
    static boolean isIsogram(String data) {
        HashMap < Character, Integer > map = new HashMap < > ();

        for (int itr = 0; itr < data.length(); ++itr) {
            if (!map.containsKey(data.charAt(itr))) {
                map.put(data.charAt(itr), 1);
            } else {
                return false;
            }
        }
        return true;
    }
}

//O(1) space



class Solution
{
    static boolean isIsogram(String data){
       char[] hash = new char[256];
        
        for(int itr = 0; itr < data.length(); ++itr){
            if(hash[(int)data.charAt(itr)] != 0){
                return false;
            } else {
                hash[(int)data.charAt(itr)]++;
            }
        }
        return true;
    }
}


