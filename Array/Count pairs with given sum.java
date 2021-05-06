/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.

Example 1:

Input:
N = 4, K = 6
arr[] = {1, 5, 7, 1}
Output: 2
Explanation: 
arr[0] + arr[1] = 1 + 5 = 6 
and arr[1] + arr[3] = 5 + 1 = 6.

Example 2:

Input:
N = 4, X = 2
arr[] = {1, 1, 1, 1}
Output: 6
Explanation: 
Each 1 will produce sum 2 with any 1.

Your Task:
You don't need to read input or print anything. Your task is to complete the function getPairsCount() which takes arr[], n and k as input parameters and returns the number of pairs that have sum K.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <= 105
1 <= K <= 108
1 <= Arr[i] <= 106
*/

//  Kashif Iqbal
//  06-May-2021
 

class Solution {
    
    int getPairsCount(int[] arr, int n, int k) {
        
        HashMap<Integer,Integer> mp = new HashMap<>();
        
        for(int itr=0; itr<n; ++itr){
            if(!mp.containsKey(arr[itr])){
                mp.put(arr[itr] , 0);
            }
            mp.put(arr[itr] , mp.get(arr[itr]) + 1);
        }
            
        int twiceCount = 0;
        
        for(int itr=0; itr<n; ++itr){
            if(mp.containsKey(k - arr[itr])){
                twiceCount = twiceCount + mp.get(k - arr[itr]);
            }
            if(k - arr[itr] == arr[itr]){
                twiceCount--;
            }
        }
        
        return twiceCount/2;      
    }
}
