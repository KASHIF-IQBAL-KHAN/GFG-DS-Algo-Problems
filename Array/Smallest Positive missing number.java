/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
*/

//  Kashif Iqbal
//  05-May-2021

 class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        boolean[] check = new boolean[size];
        
        for(int itr=0; itr<size; ++itr){
            if(arr[itr]>=1 && arr[itr]<=size){
                check[arr[itr]-1] = true;
            }
        }
        
        for(int itr=0; itr<size; ++itr){
            if(!check[itr]){
                return itr+1;
            }
        }
        
        return size+1;
    }
}

