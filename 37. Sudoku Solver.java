class Solution {
    static boolean findEmptyCell(char[][] board, int[] isEmpty){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.'){
                    isEmpty[0] = i;
                    isEmpty[1] = j;
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isSafe(char[][] board, int row, int col, char charVal){
        //row
        for(int i=0; i<9; i++){
            if(board[row][i]==charVal){
                return false;
            }
        }
        //column
        for(int i=0; i<9; i++){
            if(board[i][col]==charVal){
                return false;
            }
        }
        //matrix
        int startRow = row - row%3;
        int startCol = col - col%3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                int actRow = startRow + i;
                int actCol = startCol + j;
                if(board[actRow][actCol]==charVal){
                    return false;
                }
            }
        }
        return true;
    }

    static boolean solve(char[][] board){
        int[] isEmpty = new int[2];
        if(findEmptyCell(board, isEmpty)==false){
            return true;
        }

        int row = isEmpty[0];
        int col = isEmpty[1];
        for(int i=1; i<=9; i++){
            char charVal = (char)(i + '0');
            if(isSafe(board, row, col, charVal)){
                board[row][col] = charVal;

                if(solve(board)==true) return true;
                board[row][col] = '.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        solve(board);
    }
}
