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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<TreeNode> list = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = queue.poll();
                list.add(curr);
                if(curr.left != null){
                    queue.add(curr.left);
                }
                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            if(level % 2 == 1){
                int l = 0;
                int r = list.size() - 1;
                while(l < r){
                    int temp = list.get(l).val;
                    list.get(l).val = list.get(r).val;
                    list.get(r).val = temp;
                    l++;
                    r--;
                }
            }
            level++;
        }
        return root;
    }
}