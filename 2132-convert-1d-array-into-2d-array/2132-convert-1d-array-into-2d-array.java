class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int res[][] = new int[m][n];
        if(original.length != m*n){
            return new int[0][0]; 
        }
        for(int i=0;i<original.length;i++){
            res[i/n][i%n] = original[i];
        }
        return res; 
    }
}