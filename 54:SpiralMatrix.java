class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        ArrayList<Integer> list = new ArrayList<>();
    
            int srow = 0, scol=0, erow=n-1, ecol=m-1;

            while(erow>=srow && ecol>=scol){
                for(int j=scol; j<=ecol; j++){
                    list.add(matrix[srow][j]);
                }
                for(int i=srow+1; i<=erow; i++){
                    list.add(matrix[i][ecol]);
                }
                if(srow<erow){
                    for(int j=ecol-1; j>=scol; j--){
                        list.add(matrix[erow][j]);
                    }
                }
                if(scol<ecol){
                    for(int i=erow-1; i>srow; i--){
                        list.add(matrix[i][scol]);
                    }
                }
                srow++;
                erow--;
                scol++;
                ecol--;
        }
         return list; 
    }
}
