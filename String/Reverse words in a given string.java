/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i
Explanation: After reversing the whole
string(not individual words), the input
string becomes
much.very.program.this.like.i

Example 2:

Input:
S = pqr.mno
Output: mno.pqr
Explanation: After reversing the whole
string , the input string becomes
mno.pqr

Your Task:

You dont need to read input or print anything. Complete the function reverseWords() which takes string S as input parameter and returns a string containing the words in reversed order. Each word in the returning string should also be separated by '.' 

Expected Time Complexity: O(|S|)
Expected Auxiliary Space: O(|S|)

Constraints:
1 <= |S| <= 2000
*/

// Kashif Iqbal
// 17-May-2021	

class Solution{
    //Function to reverse words in a given string.

    String reverseWords(String S){
        
        String[] words = S.split("\\.");
        
        ArrayList<String> list = new ArrayList<>();
        String reverseList = "";
        
        for(String str : words){
            list.add(str);
        }
        
        ListIterator<String> itr = list.listIterator(list.size());
        
        while(itr.hasPrevious()){
            reverseList = reverseList + itr.previous();
            if(itr.hasPrevious()){
                reverseList = reverseList + ".";
            }
        }
        
        return answer;
    }
}