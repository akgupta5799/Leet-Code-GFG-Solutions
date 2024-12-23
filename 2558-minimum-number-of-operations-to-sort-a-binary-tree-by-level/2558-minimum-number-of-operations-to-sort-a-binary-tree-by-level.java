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
    public int minimumOperations(TreeNode root) {
        int res = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<TreeNode> list = new ArrayList<>();
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
            res += minSwapToSort(list);
        }
        return res;
    }

    public static int minSwapToSort(List<TreeNode> list){
        int count = 0;
        int arr[] = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i).val;
        }
        int n = arr.length;
        int temp[] = Arrays.copyOfRange(arr, 0, n);
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], i);
        }

        for(int i=0;i<n;i++){
            if(arr[i] != temp[i]){
                count++;
                int curr = arr[i];

                swap(arr, i, map.get(temp[i]));

                map.put(curr, map.get(temp[i]));

                map.put(temp[i], i);
            }
        }
        return count;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}