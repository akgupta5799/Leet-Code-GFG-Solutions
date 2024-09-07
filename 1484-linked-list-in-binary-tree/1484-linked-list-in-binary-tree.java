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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<TreeNode> list = new ArrayList<>();
    public boolean isSubPath(ListNode head, TreeNode root) {
        storingList(head,root);
        for(TreeNode ele : list){
            if(checkPath(head,ele)){
                return true;
            }
        }
        return false;
    }
    
    // We are checking that linked list nodes are present in tree or not,if present , we will add in our list.
    public void storingList(ListNode head, TreeNode root){
        if(head==null || root==null) return;
        if(head.val==root.val){
            list.add(root);
        }
        storingList(head,root.left);
        storingList(head,root.right);
    }
    // Here we are checking that if all linked list nodes are present in the tree then they are present in consecutive/sequence
    public boolean checkPath(ListNode head,TreeNode root){
        if(head==null) return true;
        if(root==null) return false;

        if(head.val==root.val){
         return (checkPath(head.next,root.left)||checkPath(head.next,root.right));
        }
        return false;
    }
}    