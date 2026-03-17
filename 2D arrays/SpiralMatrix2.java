public class SpiralMatrix2 {
    
   // TC -> O(n2)
    //SC -> O(1)
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n] ;
        int sRow = 0, eRow = n - 1 ;
        int sCol = 0, eCol = n - 1 ;
        int num = 1 ;

        while(sRow <= eRow && sCol <= eCol && num <= n * n) {
              // top 
            for(int j=sCol; j<=eCol; j++) {
              mat[sRow][j] = num ;
              num++ ;
            }
            // right
            for(int i=sRow + 1; i<=eRow; i++) {
              mat[i][eCol] = num ;
              num++ ;
            }
            // bottom 
            for(int j=eCol-1; j>=sCol; j--) {
              if(sRow == eRow) {
                break ;
              }
              mat[eRow][j] = num ;
              num++ ;
            }
            // left
            for(int i=eRow-1; i>sRow; i--) {
              if(sCol == eCol) {
                break ;
              }
              mat[i][sCol] = num ;
              num++ ;
            }

            sRow++; eRow--;
            sCol++; eCol--;
        }
       return mat ;
    }
    public static void main(String[] args) {
        
    }
}
