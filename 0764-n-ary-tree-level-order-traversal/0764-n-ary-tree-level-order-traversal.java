/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(root == null) return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            ArrayList<Integer> subList = new ArrayList<>();
            for(int i=0;i<levelNum;i++){
                Node temp = queue.poll();
                subList.add(temp.val);
                for(Node child : temp.children){
                    if(child != null){
                        queue.offer(child);
                    }
                }
            }
            list.add(subList);
        }
        return list;
    }
}