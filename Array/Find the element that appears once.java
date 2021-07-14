/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given a sorted array A[] of N positive integers having all the numbers occurring exactly twice, except for one number which will occur only once. Find the number occurring only once.

Example 1:

Input:
N = 5
A = {1, 1, 2, 5, 5}
Output: 2
Explanation: 
Since 2 occurs once, while other numbers occur twice, 2 is the answer.

Example 2:

Input:
N = 7
A = {2, 2, 5, 5, 20, 30, 30}
Output: 20
Explanation:
Since 20 occurs once, while other numbers occur twice, 20 is the answer.

Your Task:
You don't need to read input or print anything. Your task is to complete the function search() which takes two arguments(array A and integer N) and returns the number occurring only once.

Expected Time Complexity: O(Log(N)).
Expected Auxiliary Space: O(1).

Constraints
0 <   N  <= 10^6
0 <= A[i] <= 10^9
*/

//  Kashif Iqbal
//  14-July-2021
 
//User function Template for Java

// class Sol {
//     public static int search(int A[], int N) {
//         for(int itr = 0; itr < N-1; itr = itr + 2) {
//             if(A[itr] != A[itr+1]) {
//                 return A[itr];
//             }
//         }
//         return A[N-1];
//     }
// }

//Using Binary Search

class Sol {

    public static int bSearch(int A[], int low, int high) {

        if (low == high) {
            return A[low];
        }

        int mid = (low + high) / 2;

        // If mid is even and element next to mid is
        // same as mid, then output element lies on
        // right side, else on left side

        if (mid % 2 == 0) {

            if (A[mid] == A[mid + 1]) {
                return bSearch(A, mid + 2, high);
            } else {
                return bSearch(A, low, mid);
            }
        } else {

            if (A[mid] == A[mid - 1]) {
                return bSearch(A, mid + 1, high);
            } else {
                return bSearch(A, low, mid - 1);
            }
        }
    }

    public static int search(int A[], int N) {
        return bSearch(A, 0, N - 1);
    }
}