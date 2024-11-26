class Solution {
    public int findChampion(int n, int[][] edges) {
        // for storing the indergree of each node
        int indegree[] = new int[n];
       
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            indegree[v]++; // u->v
        }

        int count = 0;
        int champ = -1;
        for(int i=0;i<n;i++){
            if(indegree[i] == 0){ //ith node is champion
                champ = i;
                count++;
                if(count > 1){
                    return -1;
                }
            }
        }
        return champ;
    }
}