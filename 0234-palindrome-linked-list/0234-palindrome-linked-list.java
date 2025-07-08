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
        // ArrayList<Integer> list = new ArrayList<>();   
        // ListNode curr = head;
        // while(curr != null){
        //     list.add(curr.val);
        //     curr = curr.next;
        // }
        // int l = 0;
        // int r = list.size() - 1;
        // while(l < r){
        //     if(list.get(l) != list.get(r)){
        //         return false;
        //     }
        //     l++;
        //     r--;
        // }
        // return true;
        ListNode mid = middle(head);
        ListNode tail = reverse(mid);
        ListNode curr = head;
        while(tail != null){
            if(curr.val != tail.val){
                return false;
            }
            curr = curr.next;
            tail = tail.next;
        }
        return true;
    }
    public static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null, curr = head, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
}