class Solution {
    public void setZeroes(int[][] matrix) {
        //Brute Force T.C. O((mn)*(m+n)) &b S.C. O(m*n)
        /*int m = matrix.length;
        int n = matrix[0].length;
        int temp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                temp[i][j] = matrix[i][j];
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    for(int k=0;k<n;k++){
                        temp[i][k] = 0;
                    }

                    for(int k=0;k<m;k++){
                        temp[k][j] = 0;
                    }
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = temp[i][j];
            }
        }*/

        // Better Approach: T.C. O(m*n) & S.C. O(m + n)
        /*int m = matrix.length;
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
        }*/

        // Optimal Approach : T.C. O(m*n) & S.C. O(1) [constant space]
        int m = matrix.length;
        int n = matrix[0].length;

        // check first col is there any zero present
        boolean firstColZero = false;
        for(int i=0;i<m;i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
            }
        }

        // check first row is there any zero present
        boolean firstRowZero = false;
        for(int j=0;j<n;j++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
            }
        }

        // set markers -> mark first row element = 0 and first col element = 0
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Traverse from 1,1 and check marker accordingly make element zero
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        // Make all element of first col to zero if any zero is present in first col
        if(firstColZero){
            for(int i=0;i<m;i++){
                matrix[i][0] = 0;
            }
        }

        // Make all element of first row to zero if any zero is present in first row
        if(firstRowZero){
            for(int j=0;j<n;j++){
                matrix[0][j] = 0;
            }
        }

    }
}