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

/* Logic:
First find out the number of groups that shares either its row or column with other.
Let say :         G1    G2    G3    G4  ...... and let say each group contains
                  x1    x2    x3    x4  ...... stones
Removed stones =  x1-1  x2-1  x3-1  x4-1 ...... and we know x1+x2+x3+.... = n
                (x1+x2+x3+...) - (1+1+1+1+...)
                (n - number of groups) */