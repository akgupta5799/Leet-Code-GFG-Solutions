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
        // Brute Force Approach: T.C.O(m+n) & S.C. O(1)
        /*while(headA != null){
            ListNode temp = headB;
            while(temp != null){
                if(headA == temp){
                    return headA;
                }
                temp = temp.next;
            }
            headA = headA.next;
        }
        return null; */

        // Better Approach T.C.O(m+n) & S.C. O(m)
        HashSet<ListNode> set = new HashSet<>();
        while(headA != null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}