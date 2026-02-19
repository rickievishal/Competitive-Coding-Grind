class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                if(i == j){
                    continue;
                }
                matrix[i][j] += matrix[j][i];
                matrix[j][i] = matrix[i][j] - matrix[j][i];
                matrix[i][j] = matrix[i][j] - matrix[j][i];
            }
        }
        for(int a = 0 ; a < n ; a++){
            for(int b = 0 ; b < n/2 ; b++){
                matrix[a][b] += matrix[a][n-b-1];
                matrix[a][n-b-1] = matrix[a][b] - matrix[a][n-b-1];
                matrix[a][b] = matrix[a][b] - matrix[a][n-b-1];
            }
        }
    }
}
