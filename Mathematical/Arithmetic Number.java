/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given three integers  'A' denoting the first term of an arithmetic sequence , 'C' denoting the common difference of an arithmetic sequence and an integer 'B'. you need to tell whether 'B' exists in the arithmetic sequence or not.

Example 1:

Input: A = 1, B = 3, C = 2
Output: 1
Explaination: 3 is the second term of the sequence starting with 1 and having a common difference 2.

Example 2:

Input: A = 1, B = 2, C = 3
Output: 0
Explaination: 2 is not present in the sequence.

Your Task:
You do not need to read input or print anything. Your task is to complete the function inSequence() which takes A, B and C and returns 1 if B is present in the sequence. Otherwise, returns 0.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
-109 ≤ A, B, C ≤ 109  
*/

//  Kashif Iqbal
//  19-July-2021
 
class Solution {
    static int inSequence(int A, int B, int C) {
        if (C == 0) {
            if (A == B) {
                return 1;
            }
            return 0;
        }

        //((B-A) / C >= 0)) to handle negative B
        if ((((B - A) % C == 0) && ((B - A) / C >= 0))) {
            return 1;
        }
        return 0;
    }

}
