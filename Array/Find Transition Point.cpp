/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.*/
/*

// Kashif Iqbal
// 01-May-2020

int transitionPoint(int arr[], int n) {
    // code here
    if(n == 0 || arr[0]==1){
        return 0;
    }
    
    int lowerBound=0, upperBound=n-1;
    
    while(lowerBound <= upperBound){
        int mid = (lowerBound + upperBound)/2;
        
        if(arr[mid] == 0){
            lowerBound = mid + 1;
        }
        
        else if(arr[mid] == 1){
            if(arr[mid-1] == 0){
                return mid;
            }
            upperBound = mid - 1;
        }
    }
    return -1;
}