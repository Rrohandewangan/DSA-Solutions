public class RotateMatrixTo90deg {

      // brute force ->
    // Tc -> O(n2)
    // Sc -> O(n2)
    public void rotate(int[][] mat) {
        int n = mat.length ;

        int[][] ans = new int[n][n] ; // ans 2d array to store answer after rotation

        for(int row = 0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                // row of original array -> col of rotated array and col of original array -> n-1-row of rotated array.
                ans[col][n - row - 1] = mat[row][col] ; 
            }
        }
         
        // copy back to element from answer matrix to original matrix

        for(int row=0; row < n; row++) {
            for(int col = 0; col < n; col++) {
                mat[row][col] = ans[row][col] ;
            }
        }
    }

    // optimal solution ->

      public void rotate(int[][] mat) {
        
        // TC -> O(n2)
        // SC -> O(1)

        // take a transpose of array -> row -> col and col -> row
        int n = mat.length ;
        for(int row=0; row < n-1; row++) {
            for(int col=row+1; col < n; col++) {
                int temp = mat[row][col] ;
                mat[row][col] = mat[col][row] ;
                mat[col][row] = temp ;
            }
        }

        // reverse the array to get rotated array

        for(int row=0; row < n; row++) {
            int st = 0, end = n-1;

          // swap the element until st <= end move toward each other
            while(st <= end) {
                int temp = mat[row][st] ;
                mat[row][st] = mat[row][end] ;
                mat[row][end] = temp ;
                st++ ;
                end-- ;
            }

        }
    }
    public static void main(String[] args) {
    int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}}  ;

    
    }
}