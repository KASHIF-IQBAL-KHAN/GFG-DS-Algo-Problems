/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
*/

//  Kashif Iqbal
//  02-May-2021

class Solution {
    int countZeroes(int[] arr, int n) {
        int lowerBound=0 , upperBound = n-1;

        while(lowerBound <= upperBound){
            int mid = (lowerBound+upperBound)/2;
            if(arr[mid] == 0){
            upperBound = mid-1;
            } 
            else{
                lowerBound = mid+1;
                if(arr[lowerBound] == 0){
                    break;
                }
            }
        }
        return n-lowerBound;
    }
}