/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
*/

// Kashif Iqbal
// 02-May-2021

class Solution{
  public:
    int findExtra(int a[], int b[], int n) {
        int index;
        for(int itr=0 ; itr<n; ++itr){
            if(a[itr] != b[itr]){
                index = itr;
                break;
            }
        }
        return index;
    }
};