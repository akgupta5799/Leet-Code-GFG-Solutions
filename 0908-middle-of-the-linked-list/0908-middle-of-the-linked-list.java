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
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;

        ListNode curr = head;
        int length = 0;
        while(curr!=null){
            length++;
            curr = curr.next;
        }

        int len = length/2;
        curr = head;
        for(int i=0;i<len;i++){
            curr = curr.next;
        }
        return curr;


        // ListNode slow = head;
        // ListNode fast = head;

        // while(fast!=null && fast.next!=null){
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }

        // return slow;
    }
}