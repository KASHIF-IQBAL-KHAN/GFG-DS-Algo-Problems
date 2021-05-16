/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a dictionary of words and a pattern. Every character in the pattern is uniquely mapped to a character in the dictionary. Find all such words in the dictionary that match the given pattern. 

Example 1:

Input:
N = 4
dict[] = {abb,abc,xyz,xyy}
pattern  = foo
Output: abb xyy
Explanation: xyy and abb have the same
character at index 1 and 2 like the
pattern.

Your Task:

You don't need to read input or print anything. Your task is to complete the function findMatchedWords() which takes an array of strings dict[] consisting of the words in the dictionary and a string, Pattern and returns an array of strings consisting of all the words in the dict[] that match the given Pattern in lexicographical order.

Expected Time Complexity: O(N*K) (where K is the length of the pattern).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 10
*/

// Kashif Iqbal
// 17-May-2021	

class GfG
{
	public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    int patternCount = 0;
	    int dictCount = 0;
	    
	    ArrayList<String> resultList = new ArrayList<>();
	    
	    for(int itr = 0; itr < pattern.length()-1; ++itr){
	        if(pattern.charAt(itr) == pattern.charAt(itr + 1)){
	            patternCount = patternCount + 1;
	        }
	    }
	    
	    for(String str : dict){
	        
	        if(str.length() == pattern.length()){
	            
    	        dictCount = 0;
    	        
    	        for(int itr = 0; itr < str.length()-1; ++itr){
    	            if(str.charAt(itr) == str.charAt(itr + 1)){
        	            dictCount = dictCount + 1;
    	            }
                }
                
                if(patternCount == dictCount){
                    resultList.add(str);   
                }
	    }
        }
        
        return resultList;
	}
}