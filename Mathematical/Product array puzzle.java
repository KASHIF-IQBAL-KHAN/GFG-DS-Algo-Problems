/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given an array nums[] of size n, construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].

Example 1:

Input:
n = 5
nums[] = {10, 3, 5, 6, 2}
Output:
180 600 360 300 900
Explanation: 
For i=0, P[i] = 3*5*6*2 = 180.
For i=1, P[i] = 10*5*6*2 = 600.
For i=2, P[i] = 10*3*6*2 = 360.
For i=3, P[i] = 10*3*5*2 = 300.
For i=4, P[i] = 10*3*5*6 = 900.

Example 2:

Input:
n = 2
nums[] = {12,0}
Output:
0 12

Your Task:
You do not have to read input. Your task is to complete the function productExceptSelf() that takes array nums[] and n as input parameters and returns a list of n integers denoting the product array P. If the array has only one element the returned list should should contains one value i.e {1}
Note: Try to solve this problem without using the division operation.

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1 <= n <= 1000
0 <= numsi <= 200
Array may contain duplicates.
*/

//  Kashif Iqbal
//  15-July-2021
 //User function Template for Java

// O(N^2)

// class Solution 
// { 
// 	public static long[] productExceptSelf(int nums[], int n) 
// 	{ 
// 	    long[] productArray = new long[n];

// 	    for(int itr = 0; itr < n; ++itr){
// 	        long product = 1;
// 	        for(int jtr = 0; jtr < n; ++jtr){
// 	            if(itr != jtr){
// 	                product = product * nums[jtr];
// 	            }
// 	        }
// 	        productArray[itr] = product;
// 	    }
// 	    return productArray;
// 	} 
// } 

// O(N)

class Solution {
    public static long[] productExceptSelf(int nums[], int n) {
        long ansProductArray[] = new long[n];

        if (n == 1) {
            ansProductArray[0] = 1;
            return ansProductArray;
        }

        long leftProductArray[] = new long[n];
        long rightProductArray[] = new long[n];

        long product = 1;

        for (int itr = 0; itr < n; ++itr) {
            product = product * nums[itr];
            leftProductArray[itr] = product;
        }

        product = 1;

        for (int itr = n - 1; itr >= 0; --itr) {
            product = product * nums[itr];
            rightProductArray[itr] = product;
        }

        for (int itr = 0; itr < n; ++itr) {
            if (itr == 0) {
                ansProductArray[itr] = rightProductArray[itr + 1];
            } else if (itr == n - 1) {
                ansProductArray[itr] = leftProductArray[itr - 1];
            } else {
                ansProductArray[itr] = leftProductArray[itr - 1] * rightProductArray[itr + 1];
            }
        }
        return ansProductArray;

    }
}

//Easy Method

class Solution {
    public static long product(int ind, int n, int arr[] ) {
        long prod = 1;
        for(int i = 0; i < ind; i++) {
            prod = prod *arr[i];
        }
        for(int i = ind + 1; i < n; i++) {
            prod = prod * arr[i];
        }
        
        return prod;
    }

	public static long[] productExceptSelf(int nums[], int n) 
	{ 
	    long arr[] = new long[n];
        for(int i =0; i < n; i++) {
            arr[i] = product(i,n,nums);
        }
        
        return arr;
	}
}