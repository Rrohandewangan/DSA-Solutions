public class SetMatrixToZeros {


    // brute force ->
    // TC -> O(m * n * (n + m) + (m * n))
    // SC -> O(m * n)
    //  public static void setZeroes(int[][] mat) {
    //     int m = mat.length, n = mat[0].length ;

    //     boolean[][] mark = new boolean[m][n] ;
    //     // check cell is zero or not
    //     for(int row = 0; row < m; row++) {
    //         for(int col = 0; col < n; col++) {
    //             if(mat[row][col] == 0) {
                   
    //                // mark for entire row if cell is zero 
    //                for(int j=0; j<n; j++) {
    //                 if(mat[row][j] != 0) {
    //                     mark[row][j] = true ;
    //                 }
    //                }

    //                // mark for entire column if cell is zero
    //                for(int i=0; i<m; i++) {
    //                 if(mat[i][col] != 0) {
    //                     mark[i][col] = true ;
    //                 }
    //                }
    //             }
    //         }
    //     }
        
    //     // second pass -> if cell mark as -1 set it to zero 
    //     for(int row = 0; row < m; row++) {
    //         for(int col = 0; col < n; col++) {
    //             if(mark[row][col]) {
    //                 mat[row][col] = 0 ;
    //             }
    //         }
    //     }

    // }



    // // better approach ->
    //  // better approach ->
    // // TC -> O(2 * (n*m))
    // // SC -> O(n) + O(m)
    // public static void setZeroes(int[][] mat) {
    //     int m = mat.length, n = mat[0].length ;

    //     boolean[] row = new boolean[m] ;
    //     boolean[] col = new boolean[n] ;

    //     // check and mark it if cell is zero according to cell mark corresponding ith row and jth column ;
    //     for(int i=0; i<m; i++) {
    //         for(int j=0; j<n; j++) {
    //             if(mat[i][j] == 0) {
    //                 row[i] = true ;
    //                 col[j] = true ;
    //             }
    //         }
    //     }
       
    //    // covert marked true to 0 in matrix 
    //    for(int i=0; i<m; i++) {
    //     for(int j=0; j<n; j++) {
    //         if(row[i] == true || col[j] == true) {
    //             mat[i][j] = 0 ;
    //         }
    //     }
    //    }

    // }


    // optimal approach ->
     // TC -> O(2(m * n))   
     //  // SC -> O(1)
    
    public static void setZeroes(int[][] mat) {
        int m = mat.length ;
        int n = mat[0].length ;

        // flag to mark any zeros in first row
        boolean firstRowZero = false ;
        // flag to mark any zeros in first col
        boolean firstColZero = false ;


        // check if first row has any zeros
        for(int j=0; j<n; j++) { // O(n)
            if(mat[0][j] == 0) {
                firstRowZero = true ;
                break ;
            }
        }

          // check if first column has any zeros
        for(int i=0; i<m; i++) {   // TC -> O(m)
            if(mat[i][0] == 0) {
                firstColZero = true ;
                break ;
            }
        }

        // use first row and col as markers
        for(int i=1; i<m; i++) {   //O(m * n)
            for(int j=1; j<n; j++) {
                if(mat[i][j] == 0) {
                    mat[i][0] = 0 ;
                    mat[0][j] = 0 ;
                }
            }
        }

        // set cells to zero based on makers
         for(int i=1; i<m; i++) { // TC -> O(m * n)
            for(int j=1; j<n; j++) {
                if(mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0 ;
                } 
            }
        }

        // zeros if first row if needed
        if(firstRowZero) { // this only run if condition is true 
            for(int j=0; j<n; j++) {
                mat[0][j] = 0 ;
            }
        }

         // zeros if first column if needed
        if(firstColZero) { // this only run if condition is true
            for(int i=0; i<m; i++) {
                mat[i][0] = 0 ;
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{1,1,1},{1,0,1},{1,1,1}} ;

        setZeroes(mat) ;

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[0].length; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}