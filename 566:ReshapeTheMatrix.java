class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] reshaped = new int[r][c];
        if(n*m != r*c) return mat;
        int k=0;
        for(int i=0; i<m; i++){
            for(int j=0;j<n; j++){
                reshaped[k/c][k%c] = mat[i][j];
                k++;
            }
        }
        return reshaped;
    }
}
