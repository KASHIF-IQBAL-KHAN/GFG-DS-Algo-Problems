/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.
*/

//  Kashif Iqbal
//  04-May-2021

 class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        SortedSet<Integer> sortedset= new TreeSet<Integer>();
        
        for(Integer itr : arr1){
            sortedset.add(itr);
        }
        
        for(Integer itr : arr2){
            sortedset.add(itr);
        }
      
      ArrayList<Integer> arraylist = new ArrayList<>(sortedset);
      
      return arraylist;
    }
}
