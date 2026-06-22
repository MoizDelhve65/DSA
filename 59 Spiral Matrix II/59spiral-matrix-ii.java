class Solution {
    public int[][] generateMatrix(int n) {
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int arr[][] = new int[n][n];
        int c = 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                arr[top][i] = c++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = c++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    arr[bottom][i] = c++;
                }
                bottom--;
            }
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = c++;
                }
                left++;
            }
            
            

        }
        return arr;
        
    }
}
