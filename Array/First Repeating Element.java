/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
Given an array arr[] of size n, find the first repeating element. The element should occurs more than once and the index of its first occurrence should be the smallest.

Example 1:

Input:
n = 7
arr[] = {1, 5, 3, 4, 3, 5, 6}
Output: 2
Explanation: 
5 is appearing twice and its first appearence is at index 2 
which is less than 3 whose first occuring index is 3.

Example 2:

Input:
n = 4
arr[] = {1, 2, 3, 4}
Output: -1
Explanation: 
All elements appear only once so 
answer is -1.

Your Task:
You don't need to read input or print anything. Complete the function firstRepeated() which takes arr and n as input parameters and return the position of the first repeating element. If there is no such element, return -1.
The position you return should be according to 1-based indexing. 

Expected Time Complexity: O(nlogn)
Expected Auxilliary Space: O(n) 

Constraints:
1 <= n <= 106
0 <= Ai<= 106
*/

//  Kashif Iqbal
//  07-May-2021
 
class Solution{
    //Function to return the position of the first repeating element.
    public static int firstRepeated(int []arr, int n) 
    {
        Map<Integer , Integer> map = new LinkedHashMap<>();
        
        int repeatingElementIndex = -1;
        int counter = 0;
        
        for(int itr=0; itr<n; ++itr){
            if(!map.containsKey(arr[itr])){
                map.put(arr[itr] , 0);
            }
            map.put(arr[itr] , map.get(arr[itr]) + 1);
        }
            
        for(Integer itr : map.values()){
            ++counter;
            if(itr > 1){
                repeatingElementIndex = counter;
                break;
            }
        }
        
        return repeatingElementIndex;        
    }
}