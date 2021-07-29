/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 

Input:
The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

Output:
For each testcase, in a new line, output the rotated array.

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 105

Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
*/

//  Kashif Iqbal
//  29-july-2021
 
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static void reverse(int low,int high,int[] arr){
        
        for(int itr = low; itr < high; ++itr){
            int temp = arr[itr];
            arr[itr] = arr[high];
            arr[high] = temp;
            --high;
        }
    }
    
	public static void main (String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int t = sc.nextInt();
	    
	    while(t > 0){
	        
    	    int n = sc.nextInt();
    	    int d = sc.nextInt();
	        
    	    int[] arr = new int[n];
    	    
    	    for(int itr = 0; itr < n; ++itr){
    	        arr[itr] = sc.nextInt();
    	    }
    	    
    	    reverse(0,d-1,arr);
    	    reverse(d,n-1,arr);
    	    reverse(0,n-1,arr);
    	    
    	    for(int itr : arr){
    	        System.out.print(itr + " ");
    	    }
    	    
    	    System.out.println();
    	    
	        t = t-1;
	    }
	}
}