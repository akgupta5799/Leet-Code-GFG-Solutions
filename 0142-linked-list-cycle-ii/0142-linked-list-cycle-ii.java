/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // T.C. O(n) and S.C. O(n) Using extra space
        // HashSet<ListNode> set = new HashSet<>();
        // while(head != null){
        //     if(!set.contains(head)){
        //         set.add(head);
        //         head = head.next;
        //     }else{
        //         break;
        //     }
        // }
        // return head;

        // Optimal Approach T.C. O(n), S.C. O(1)
        if(head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}