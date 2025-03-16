// Using DFS
// class Solution {
//     public int findCircleNum(int[][] isConnected) {
//         int n = isConnected.length;
//         HashMap<Integer, List<Integer>> adj = new HashMap<>();
//         for(int i=0;i<n;i++){
//             adj.putIfAbsent(i, new ArrayList<>());
//             for(int j=0;j<n;j++){
//                 if(isConnected[i][j] == 1){
//                     adj.get(i).add(j);
//                 }
//             }
//         }
//         boolean visited[] = new boolean[n];
//         int count = 0;
//         for(int i=0;i<n;i++){
//             if(!visited[i]){
//                 dfs(adj, i, visited);
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void dfs(HashMap<Integer, List<Integer>> adj, int node, boolean visited[]){
//         visited[node] = true;
//         for(Integer it : adj.get(node)){
//             if(!visited[it]){
//                 dfs(adj, it, visited);
//             }
//         }
//     }

// }


// Using BFS
class Solution{
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for(int i=0;i<n;i++){
            adj.putIfAbsent(i, new ArrayList<>());
            for(int j=0;j<n;j++){
                if(isConnected[i][j] == 1){
                    adj.get(i).add(j);
                }
            }
        }

        boolean visited[] = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(adj, visited, i);
                count++;
            }
        }
        return count;
    }

    public static void bfs(HashMap<Integer, List<Integer>> adj, boolean visited[], int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        while(!queue.isEmpty()){
            Integer u = queue.poll();
            for(Integer v : adj.get(u)){
                if(!visited[v]){
                    queue.add(v);
                    visited[v] = true;
                }
            }
        }
    }
}