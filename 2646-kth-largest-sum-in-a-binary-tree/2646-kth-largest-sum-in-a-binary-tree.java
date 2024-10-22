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
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Queue<TreeNode> queue = new LinkedList<>();
        //if(root == null) return null;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            long levelSum = 0;
            for(int i=0;i<levelNum;i++){
                TreeNode temp = queue.poll();
                levelSum += temp.val;
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right != null){
                    queue.offer(temp.right);
                }
            } 
            pq.add(levelSum);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.size() < k ? -1 : pq.peek();   
    }
}