/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
*/

//  Kashif Iqbal
//  03-May-2021
 
class Solution {
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
  
        long leftSideSum = 0;
        long rightSideSum = 0;
        
        for(int itr=0; itr<n; ++itr){
           rightSideSum = rightSideSum + arr[itr];
        }
        
        for(int itr=0; itr<n; ++itr){
            rightSideSum  = rightSideSum - arr[itr];
            if(leftSideSum == rightSideSum){            
                return itr+1;
            }
            else{
               leftSideSum = leftSideSum + arr[itr];
            }
        }
        
        return -1;
    }
}