class Solution {
    public void setZeroes(int[][] matrix) {
        // Brute Force T.C. O((mn)*(m+n)) &b S.C. O(m*n)
        // int m = matrix.length;
        // int n = matrix[0].length;
        // int temp[][] = new int[m][n];
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         temp[i][j] = matrix[i][j];
        //     }
        // }

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j] == 0){
        //             for(int k=0;k<n;k++){
        //                 temp[i][k] = 0;
        //             }

        //             for(int k=0;k<m;k++){
        //                 temp[k][j] = 0;
        //             }
        //         }
        //     }
        // }

        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         matrix[i][j] = temp[i][j];
        //     }
        // }

        // Better Approach: T.C. O(m*n) & S.C. O(m + n)
        int m = matrix.length;
        int n = matrix[0].length;
        boolean row[] = new boolean[m];
        boolean col[] = new boolean[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}