/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given an array arr[] of size N and an element k. The task is to find all elements in array that appear more than n/k times.

Example 1:

Input:
N = 8
arr[] = {3,1,2,2,1,2,3,3}
k = 4
Output: 2
Explanation: In the given array, 3 and 2 are the only elements that appears more than n/k times.

Example 2:

Input:
N = 4
arr[] = {2,3,3,2}
k = 3
Output: 2
Explanation: In the given array, 3 and 2 are the only elements that appears more than n/k times. So the count of elements are 2.

Your Task:
The task is to complete the function countOccurence() which returns count of elements with more than n/k times appearance.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).

Constraints:
1 <= N <= 104
1 <= a[i] <= 106
1 <= k <= N
*/

//  Kashif Iqbal
//  28-May-2021
 
class Solution{
    
    public int countOccurence(int[] arr, int n, int k){
        
        int count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int itr = 0; itr < n; ++itr){
            if(!map.containsKey(arr[itr])){
                map.put(arr[itr] , 1);
            }
            else{
                map.put(arr[itr] , map.get(arr[itr]) + 1);
            }
        }   
        
        for(Map.Entry ele : map.entrySet()){
            if((int)ele.getValue() > n/k){
                ++count;
            }
        }
        
        return count;
    }
}
