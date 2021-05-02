/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
*/

//  Kashif Iqbal
//  02-May-2021
 
class Solution{
    
    // arr: input array
    // n: size of the array
    //Function to sort the array into a wave-like array.
    
    public static void convertToWave(int arr[], int n){
        int temp;
        for(int itr=0; itr<n-1; itr=itr+2){
            temp = arr[itr];
            arr[itr] = arr[itr+1];
            arr[itr+1] = temp;
        }
    }
}