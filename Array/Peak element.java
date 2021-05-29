/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

A peak element in an array is the one that is not smaller than its neighbours.
Given an array arr[] of size N, find the index of any one of its peak elements.
Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 

Example 1:

Input:
N = 3
arr[] = {1,2,3}
Output: 2
Explanation: index 2 is 3. It is the peak element as it is greater than its neighbour 2.

Example 2:

Input:
N = 2
arr[] = {3,4}
Output: 1
Explanation: 4 (at index 1) is the peak element as it is greater than its only neighbour element 3.

Your Task:
You don't have to read input or print anything. Complete the function peakElement() which takes the array arr[] and its size N as input parameters and return the index of any one of its peak elements.

Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ N ≤ 105
1 ≤ A[] ≤ 106
*/

//  Kashif Iqbal
//  29-May-2021
 
class Solution
{

	public int peakElement(int[] arr,int n){
	    
	    int index = 0;
	    	    
	    if(n == 1 || arr[0] > arr[1]){
	        return index;
	    }
	    	    
	    if((arr[n-1] > arr[n-2])){
	        return n-1;
	    }
	    
	    for(int itr = 1; itr < n-1; ++itr){
	        if(arr[itr] > arr[itr - 1] && arr[itr] > arr[itr + 1]){
	            index = itr;
	            break;
	        }
	    }
	    
	    return index;
    }
}
