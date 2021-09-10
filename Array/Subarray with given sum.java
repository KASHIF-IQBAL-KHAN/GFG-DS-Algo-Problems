/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S. 

Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
 

Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
 

Your Task:
You don't need to read input or print anything. The task is to complete the function subarraySum() which takes arr, N and S as input parameters and returns a list containing the starting and ending positions of the first such occurring subarray from the left where sum equals to S. The two indexes in the list should be according to 1-based indexing. If no such subarray is found, return -1. 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
1 <= Ai <= 1010

*/

//  Kashif Iqbal
//  18-May-2021

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int S){
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int first = 0;
        int last = 0;
        int sum = 0;
        
        while(last < n || first < n){
            
            if(sum < S && last < n){
                sum = sum + arr[last]; 
                ++last;
            }
            else if(sum == S){
                list.add(first+1);
                list.add(last);
                return list;
            }
            else if(first < n){
                sum = sum - arr[first];
                ++first;
            }
        }
     
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
        
    }
}
