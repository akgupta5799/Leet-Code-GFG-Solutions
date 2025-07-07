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
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middle(head); // finding middle node
        ListNode tail = reverse(mid); // reversing second half of linked list
        ListNode curr = head;

        while(tail!=null){
            if(curr.val != tail.val){
                return false;
            }
            tail = tail.next;
            curr = curr.next;
        }
        return true;
    }
    
    // Function for finding the middle node
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // if the number of nodes are odd then definitely fast pointer will be at the last node
        // if(fast!=null){
        //     return slow.next;
        // }
        return slow;
    }

    // Function for finding reverse from the mid node 
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}