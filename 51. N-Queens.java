class Solution {
    static boolean isSafe(int rowIdx, int colIdx, char[][] board, int n){
        int row = rowIdx;
        int col = colIdx;
        //left
        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        //up-diagonal
        row = rowIdx;
        col = colIdx;
        while(col>=0 && row>=0){
            if(board[row][col]=='Q') return false;
            col--;
            row--;
        }
        //down-diagonal
        row = rowIdx;
        col = colIdx;
        while(col>=0 && row<n){
            if(board[row][col]=='Q') return false;
            col--;
            row++;
        }
        return true;
    }
    static void solve(int n, char[][] board, List<List<String>> list, int colIdx){
        if(colIdx==n){
            List<String> temp = new ArrayList<>();
            for(int i=0; i<n; i++){
                temp.add(new String(board[i]));
            }
            list.add(temp);
            return;
        }

        for(int rowIdx=0; rowIdx<n; rowIdx++){
            if(isSafe(rowIdx, colIdx, board, n)){
                board[rowIdx][colIdx] = 'Q';
                solve(n, board, list, colIdx+1);

                //backtracking
                board[rowIdx][colIdx] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(board[i], '.');
        }
        List<List<String>> list = new ArrayList<>();
        int colIdx = 0;
        solve(n, board, list, colIdx);
        return list;
    }
}
