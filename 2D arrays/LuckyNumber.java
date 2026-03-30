public class LuckyNumber {

    // brute force approach -> 
    // TC -> O(m * n * (m + n))
    // SC -> O(n)
    public List<Integer> luckyNumbers(int[][] mat) {
      List<Integer> ans = new ArrayList<>() ;
      int m = mat.length ;
      int n = mat[0].length ;

      for(int i=0; i<m; i++) {
        for(int j=0; j<n; j++) {

            int val = mat[i][j];

            // check in row for min
            boolean isRowMin = true ;
            for(int col = 0; col<n; col++) {
                if(mat[i][col] < val) {
                    isRowMin = false ;
                    break;
                }
            }

            // check in col for max
            boolean isColMax = true ;
            for(int row=0; row<m; row++) {
                if(mat[row][j] > val) {
                    isColMax = false ;
                    break ;
                }
            }

            if(isRowMin && isColMax) {
               ans.add(val) ;
            }
        }
      }

      return ans ;
    }


    // optimal solution
    // TC -> O(m * n)
    // SC -> O(n)
    public List<Integer> luckyNumbers(int[][] mat) {
      List<Integer> ans = new ArrayList<>() ;
      int m = mat.length ;
      int n = mat[0].length ;

      // store row min
      int[] rowMin = new int[m] ;

      for(int i=0; i<m; i++) {
        rowMin[i] = Integer.MAX_VALUE ;
        for(int j=0; j<n; j++) {
            rowMin[i] = Math.min(rowMin[i], mat[i][j]) ;
        }
      }

       // store col max
      int[] colMax = new int[n] ;

      for(int j=0; j<n; j++) {
        colMax[j] = Integer.MIN_VALUE ;
        for(int i=0; i<m; i++) {
            colMax[j] = Math.max(colMax[j], mat[i][j]) ;
        }
      }

      for(int i=0; i<m; i++) {
        for(int j=0; j<n; j++) {

            if(mat[i][j] == rowMin[i] && mat[i][j] == colMax[j]) {
                ans.add(mat[i][j]);
            }
      }
    }  

      return ans ;

    public static void main(String[] args) {
        
    }
}