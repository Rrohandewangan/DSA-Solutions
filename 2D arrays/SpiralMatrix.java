import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
   // https://leetcode.com/problems/spiral-matrix/submissions/1904034758/


   /// Optimal Approach
    // TC -> O(m * n)
    // SC -> O(1)
    public static List<Integer> spiralOrder(int[][] mat) {
        int m = mat.length ;
        int n = mat[0].length ;
        int sRow = 0, sCol = 0, eRow = m-1, eCol = n-1 ;

        ArrayList<Integer> result = new ArrayList<>() ;
        

        while(sRow <= eRow && sCol <= eCol) {
            // top
            for(int j=sCol; j<=eCol; j++) {
                result.add(mat[sRow][j]) ;
            }

            // right
            for(int i=sRow+1; i<=eRow; i++) {
                result.add(mat[i][eCol]) ;
            }

            // bottom
            for(int j=eCol-1; j>=sCol; j--) {
                if(sRow == eRow) {
                    break ;
                } 
                result.add(mat[eRow][j]) ;
            }

            //left
            for(int i=eRow-1; i>=sRow+1; i--) {
                if(sCol == eCol) {
                    break ;
                } 
                result.add(mat[i][sCol]) ;
              }
              
              sRow++; 
              eRow--; 
              sCol++; 
              eCol-- ;
            } 
            
            return result ;
         }
    public static void main(String[] args) {
      
    }
}
