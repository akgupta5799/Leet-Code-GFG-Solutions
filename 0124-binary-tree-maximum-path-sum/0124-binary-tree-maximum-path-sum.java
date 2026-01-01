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
    private int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        solve(root);
        return maxSum;
    }
    private int solve(TreeNode root){
        if(root == null) return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        // case 1:
        int pathThroughNode = left + right + root.val;
        // case 2:
        int maxSingleSidePath = Math.max(left, right) + root.val;
        // case 3: 
        int onlyNodeValue = root.val;
        
        maxSum = Math.max(maxSum, Math.max(pathThroughNode, Math.max(maxSingleSidePath, onlyNodeValue)));

        return Math.max(maxSingleSidePath, onlyNodeValue);
        
    }
}