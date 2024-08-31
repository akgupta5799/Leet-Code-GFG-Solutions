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
    int newNode;
    int height;
    public void addNode(TreeNode root, int h){
        if(root == null){
            return;
        }
        if(h == height && root != null){
            TreeNode node1 = new TreeNode(newNode);
            TreeNode node2 = new TreeNode(newNode);
            //left
            node1.left = root.left;
            node1.right = null;
            //right
            node2.left = null;
            node2.right = root.right;
            //add
            root.left = node1;
            root.right = node2;
        }
        addNode(root.left,h+1);
        addNode(root.right,h+1);
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        height = depth-1;
        newNode = val;
        if(depth == 1){
            TreeNode node1 = new TreeNode(val);
            node1.left = root;
            root = node1;
            return root;
        }
        addNode(root,1);
        return root;
    }
}