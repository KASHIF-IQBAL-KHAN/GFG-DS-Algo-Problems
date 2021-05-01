/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.*/
/*

// Kashif Iqbal
// 01-May-2020

class Solution{
  public:
    vector<int> duplicates(int arr[], int n) {
        vector<int> vect(n,0);
        vector<int> vect1;
        
        for(int itr = 0; itr < n; ++itr){
            vect[arr[itr]]++;
        }
        
        for(int itr = 0; itr < n; ++itr){
            if(vect[itr]>1){
                vect1.push_back(itr);
            }
        }
        
        if(vect1.empty()){
            vect1.push_back(-1);
        }
        
        return vect1;
    }
};