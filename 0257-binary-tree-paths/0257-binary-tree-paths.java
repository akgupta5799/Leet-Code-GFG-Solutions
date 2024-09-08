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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        addyHelper(root,list,str);
        return list;
    }
    public static void addyHelper(TreeNode root, ArrayList<String> list, String str){
        if(root==null) return;
        if(root.left==null && root.right==null){
            str+=root.val;
            list.add(str);
            str="";
            return;
        }
        str+=root.val+"->";
        addyHelper(root.left,list,str);
        addyHelper(root.right,list,str);
    }
}