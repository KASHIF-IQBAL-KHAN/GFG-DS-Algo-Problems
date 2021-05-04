/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
*/

//  Kashif Iqbal
//  05-May-2021
 
class Solution
{
    public static void sort012(int a[], int n)
    {
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        while(mid<=high){
            
            if(a[mid] == 0){
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                mid++;
                low++;
            }
            
            else if(a[mid] == 2){
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
            
            else{
                mid++;
            }
        }
    }
}
//Arrays.sort(a); One Line Solution