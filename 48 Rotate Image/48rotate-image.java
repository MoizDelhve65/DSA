class Solution {
    public void rotate(int[][] matrix) { 
        int n = matrix.length;
        int m = matrix[0].length;
        int t;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

        //reverse the matrix now
        int temp;

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][m-j-1];
                matrix[i][m-j-1] = temp;
            }
        }
        
    }
}