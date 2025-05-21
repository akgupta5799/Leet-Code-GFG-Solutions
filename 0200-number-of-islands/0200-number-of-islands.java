class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        boolean visited[][] = new boolean[m][n]; 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    merge(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }
    public void merge(char[][] grid, int i, int j, boolean visited[][]){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0' || visited[i][j] == true){
            return;
        }
        visited[i][j] = true;

        merge(grid, i+1, j, visited);
        merge(grid, i, j+1, visited);
        merge(grid, i-1, j, visited);
        merge(grid, i, j-1, visited);
    }
}

