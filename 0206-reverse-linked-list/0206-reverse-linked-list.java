/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        // Iterative Approach
        
        // ListNode prev = null;
        // ListNode curr = head;
        // ListNode next = null;

        // while(curr != null){
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }
        // return prev;

        // Recursive Approach

        // Base Case: if head is null or only one node in the list 
        if(head == null || head.next == null) return head;

        ListNode last = reverseList(head.next); // Future head
        head.next.next = head;
        head.next = null;

        return last;
    }
}