class Solution {
    public int removeStones(int[][] stones) {
        int n = stones.length;
        boolean visited[] = new boolean[n];
        int group = 0;
        for(int i=0;i<n;i++){
            if(visited[i] == true){
                continue;
            }
            dfs(stones, i, visited);
            group++;
        }
        return (n-group);
    }

    public void dfs(int stones[][], int idx, boolean visited[]){
        visited[idx] = true;
        for(int i=0;i<stones.length;i++){
            int r = stones[idx][0];
            int c = stones[idx][1];
            if(visited[i] == false && (stones[i][0] == r || stones[i][1] == c)){
                dfs(stones, i, visited);
            }
        }
    }
}