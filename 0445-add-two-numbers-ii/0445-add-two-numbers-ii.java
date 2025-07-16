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
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         l1 = reverse(l1);
//         l2 = reverse(l2);
//         ListNode l3 = new ListNode(0);
//         ListNode dummy = l3;
//         int carry = 0;
//         while(l1!=null && l2!=null){
//             int value = l1.val + l2.val + carry;
//             carry = value/10;
//             l3.next = new ListNode(value%10);
//             l3 = l3.next;
//             l1 = l1.next;
//             l2 = l2.next;
//         }
//         while(l1!=null){
//             int value = l1.val + carry;
//             carry = value/10;
//             l3.next = new ListNode(value%10);
//             l3 = l3.next;
//             l1 = l1.next;
//         }
//         while(l2!=null){
//             int value = l2.val + carry;
//             carry = value/10;
//             l3.next = new ListNode(value%10);
//             l3 = l3.next;
//             l2 = l2.next;
//         }
//         if(carry!=0){
//             l3.next = new ListNode(carry);
//         }
//         return reverse(dummy.next);
//     }
//     public ListNode reverse(ListNode head){
//         ListNode prev = null;
//         ListNode curr = head;
//         ListNode next = null;
//         while(curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }
// }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dummy = new ListNode(0);
        int carry = 0;
        while(l1!=null && l2!=null){
            int value = l1.val + l2.val + carry;
            carry = value/10;
            ListNode newNode = new ListNode(value%10);
            newNode.next = dummy.next;
            dummy.next = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            int value = l1.val + carry;
            carry = value/10;
            ListNode newNode = new ListNode(value%10);
            newNode.next = dummy.next;
            dummy.next = newNode;
            l1 = l1.next;
        }
        while(l2!=null){
            int value = l2.val + carry;
            carry = value/10;
            ListNode newNode = new ListNode(value%10);
            newNode.next = dummy.next;
            dummy.next = newNode;
            l2 = l2.next;
        }
        if(carry!=0){
            ListNode newNode = new ListNode(carry);
            newNode.next = dummy.next;
            dummy.next = newNode;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}