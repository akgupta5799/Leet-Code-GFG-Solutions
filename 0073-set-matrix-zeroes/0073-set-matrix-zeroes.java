class Solution {
    public void setZeroes(int[][] matrix) {
        // Brute force  Time Complexity: O((mn)*(m+n))
        // Space Complexity: O(mn)
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

        // Better Approach ( Reducing Space )
        // Time Complexity: O(m*n)
        // Space Complexity: O(m+n)
        int m = matrix.length;
        int n = matrix[0].length;
        int row[] = new int[m];
        int col[] = new int[n];

        Arrays.fill(row, 1);
        Arrays.fill(col, 1);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i] == 0 || col[j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        // Optimal Approach 
        // Time Complexity: O(m*n)
        // Space Complexity: O(1)

    }
}