/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // T.C. O(m*n) & S.C. O(1)
        // while(headA != null){
        //     ListNode temp = headB;
        //     while(temp != null){
        //         if(headA == temp){
        //             return headA;
        //         }
        //         temp = temp.next;
        //     }
        //     headA = headA.next;
        // }
        // return null;

        //Optimal (Two Pointers)
        if(headA == null || headB == null){
            return null;
        }

        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != tempB){
            if(tempA == null){
                tempA = headB;
            }else{
                tempA = tempA.next;
            }
            if(tempB == null){
                tempB = headA;
            }else{
                tempB = tempB.next;
            }
        }
        return tempA;

    }
}