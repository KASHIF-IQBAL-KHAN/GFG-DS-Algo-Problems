/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a string that contains ternary expressions. The expressions may be nested. You need to convert the given ternary expression to a binary Tree and return the root.

Input Format:
First line of input contains of test case T. The only line of test case consists of String s.

Output Format:
Preorder traversal of Tree formed

Your Task:
This is a function problem, you don't need to read input/output. Just complete the function convertExpression that take string and index(initialized from 0) as parameters.

Constraints:
1 <= T <= 100
1 <= |String| <= 100

Example:

Input:
2
a?b:c
a?b?c:d:e

Output:
a b c
a b c d e

Explanation:

Testcase1:
Input :  string expression =   a?b:c
Output :       a
              /  \
             b    c

Testcase2:
Input : expression =  a?b?c:d:e
Output :         a
                /  \
              b    e
             /  \
            c    d
*/

// Kashif Iqbal
// 17-May-2021	

class GfG
{
    
    public static Node convertExp(String str, int i)
    {
        if(i > str.length()){
            return null;
        }
         
        Node root = new Node(str.charAt(i));
        
        i++;
        
        if(i < str.length() && str.charAt(i) == '?'){
            root.left = convertExp(str, i+1);
        }
        
        if(i < str.length() && str.charAt(i) == ':'){
            root.right = convertExp(str, i+1);
        }
      
        return root;  
    }
}