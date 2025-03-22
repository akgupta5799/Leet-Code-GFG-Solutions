class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for(int i=0;i<numCourses;i++){
            adj.put(i, new ArrayList<>());
        }
        int indegree[] = new int[numCourses];
        for(int[] pair : prerequisites){
            int a = pair[0];
            int b = pair[1];
            // b ----> a
            adj.get(b).add(a);
            indegree[a]++;  
        }
        return topologicalSort(adj, numCourses, indegree);

    }
    public static int[] topologicalSort(HashMap<Integer, List<Integer>> adj, int n, int[] indegree){
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        for(int i=0;i<n;i++){
            if(indegree[i] == 0){
                queue.add(i);
                res.add(i);
                count++;
            }
        }
        
        while(!queue.isEmpty()){
            int u = queue.poll();
            for(Integer v : adj.get(u)){
                indegree[v]--;
                if(indegree[v] == 0){
                    queue.add(v);
                    res.add(v);
                    count++;
                }
            }
        }
        if(count != n){
            return new int[]{};
        }
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}