class Solution {
    int peri;
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1 && visited[i][j] == false){
                    merge(grid, i, j, visited);
                    return peri;
                }
            }
        }
        return -1;
    }

    public void merge(int[][] grid, int i, int j, boolean[][] visited){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0 ){
            peri++;
            return;
        }
        if(visited[i][j] == true) return;
        visited[i][j] = true;

        merge(grid, i+1, j, visited);
        merge(grid, i, j+1, visited);
        merge(grid, i-1, j, visited);
        merge(grid, i, j-1, visited);
    }
}