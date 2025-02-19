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
    public ListNode mergeKLists(ListNode[] lists) {
        // using merge sort
        int k = lists.length;
        if(k == 0) return null;

        return partitionAndMerge(lists, 0, k-1);
    }

    public static ListNode partitionAndMerge(ListNode[] lists, int start, int end){
        if(start > end) return null;
        if(start == end) return lists[start];
        int mid = start + (end - start)/2;
        ListNode l1 = partitionAndMerge(lists, start, mid);
        ListNode l2 = partitionAndMerge(lists, mid+1, end);

        return mergeKSortedLists(l1, l2);
    }

    public static ListNode mergeKSortedLists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val <= l2.val){
            l1.next = mergeKSortedLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeKSortedLists(l1, l2.next);
            return l2;
        }
        //return null;
    }
}