class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashSet<Integer> set = new HashSet<>();
        int res[] = new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(set.contains(grid[i][j])){
                    res[0] = grid[i][j];
                }else{
                    set.add(grid[i][j]);
                }    
            }
        }

        for(int i=1;i<=n*n;i++){
            if(!set.contains(i)){
                res[1] = i;
            }
        }
        return res;
    }
}