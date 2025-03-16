class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for(int i=0;i<numCourses;i++){
            adj.put(i, new ArrayList<>());
        }
        int indegree[] = new int[numCourses];
        for(int pair[] : prerequisites){
            int a = pair[0];
            int b = pair[1];
            // b ---> a
            adj.get(b).add(a);
            indegree[a]++;
        }

        // If Cycle present , not possible
        return topologicalSortCheck(adj, indegree, numCourses);
    }

    public static boolean topologicalSortCheck(HashMap<Integer, List<Integer>> adj, int indegree[], int n){
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        for(int i=0;i<n;i++){
            if(indegree[i] == 0){
                queue.add(i);
                count++;
            }
        }
        while(!queue.isEmpty()){
            int u = queue.poll();
            for(Integer v : adj.get(u)){
                indegree[v]--;
                if(indegree[v] == 0){
                    queue.add(v);
                    count++;
                }
            }
        }
        return count == n;
    }
}