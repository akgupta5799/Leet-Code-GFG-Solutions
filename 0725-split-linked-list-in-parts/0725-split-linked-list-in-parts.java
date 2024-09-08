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
    public ListNode[] splitListToParts(ListNode head, int k) {
       ListNode[] res = new ListNode[k]; 
       int totalLength = 0;
       ListNode temp = head;
       while(temp!=null){
           temp = temp.next;
           totalLength++;
       }
       int len = totalLength / k;
       int remain = totalLength % k;

       ListNode curr = head;
       ListNode prev = null;
       int i=0;
       while(curr!=null && i<k){
           res[i] = curr;
           for(int j=0;j<len+(remain >0?1:0);j++){
               prev = curr; 
               curr = curr.next;
           }
           prev.next = null;
           i++;
           remain--;
       }
       return res;

    }
}