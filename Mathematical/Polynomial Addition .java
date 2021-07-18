/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GFG's Online Judge.

Given two polynomial numbers represented by a linked list. The task is to complete the function addPolynomial() that adds these lists meaning adds the coefficients who have the same variable powers.
Note:  Given polynomials are sorted in decreasing order of power.

Example 1:

Input:
LinkedList1:  (1,x2) 
LinkedList2:  (1,x3)

Output:
1x^3 + 1x^2
Explanation: Since, x2 and x3 both have different powers as 2 and 3. So, their coefficient can't be added up.

Example 2:

Input:
LinkedList1:  (1,x3) -> (1,x2)
LinkedList2:  (3,x3) -> (4,x2)

Output:
4x^3 + 6x^2
Explanation: Since, x3 has two different coefficients as 3 and 1. Adding them up will lead to 4x3. Also, x2 has two coefficients as 4 and 2. So, adding them
up will give 6x2.

Your Task:
The task is to complete the function addPolynomial() which should add the polynomial with same powers return the required polynomial in decreasing order of the power in the form of a linked list.

Note: Try to solve the question without using any extra space.

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N, M <= 105
1 <= x, y <= 106

Constraints:
1 ≤ x ≤ 107
*/

//  Kashif Iqbal
//  18-July-2021

/********** With extra space ***********/
class Solution {
    public static Node addPolynomial(Node p1, Node p2) {

        Node newListHead = new Node(0, 0);
        Node newList = newListHead;

        while (p1 != null && p2 != null) {
            
            if (p1.pow == p2.pow) {
                Node temp = new Node(p1.coeff + p2.coeff, p1.pow);
                newList.next = temp;
                p1 = p1.next;
                p2 = p2.next;
                
            } else if (p1.pow > p2.pow) {
                Node temp = new Node(p1.coeff, p1.pow);
                newList.next = temp;
                p1 = p1.next;
                
            } else {
                Node temp = new Node(p2.coeff, p2.pow);
                newList.next = temp;
                p2 = p2.next;
            }
            newList = newList.next;
        }

        if (p1 != null) {
            newList.next = p1;
        }

        if (p2 != null) {
            newList.next = p2;
        }
        return newListHead.next;
    }
} 

/********** Without extra space ***********/

class Solution {
    public static Node addPolynomial(Node p1, Node p2) {

        Node newListHead = new Node(0, 0);
        Node newListItr = newListHead;

        while (p1 != null && p2 != null) {

            if (p1.pow == p2.pow) {
                p1.coeff = p1.coeff + p2.coeff;
                newListItr.next = p1;
                p1 = p1.next;
                p2 = p2.next;

            } else if (p1.pow > p2.pow) {
                newListItr.next = p1;
                p1 = p1.next;

            } else {
                newListItr.next = p2;
                p2 = p2.next;
            }
            newListItr = newListItr.next;
        }

        if (p1 != null) {
            newListItr.next = p1;
        }

        if (p2 != null) {
            newListItr.next = p2;
        }

        return newListHead.next;
    }
}