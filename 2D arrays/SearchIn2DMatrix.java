
public class SearchIn2DMatrix {

    // Brute force approach 
    // TC -> O(n * m)
    // SC -> O(1)

    //  public static boolean searchMatrix(int[][] matrix, int target) {
        
    //     for(int row = 0; row < matrix.length; row++) {
    //         for(int col = 0; col < matrix[0].length; col++) {
    //             if(matrix[row][col] == target) {
    //                 return true ;
    //             }
    //         }
    //     }
    //     return false ;
    // }


    // optimal approach ->
      /// optimal approach ->
        // TC -> O(log(m * n))
        // SC -> O(1)
    public static  boolean searchInRow(int[][] mat, int target, int row) { // O(logn)
         int m = mat.length, n = mat[0].length ;
         int st = 0, end = n-1 ;

         while(st <= end) {
            int mid = st + (end - st)/ 2;
            if(target == mat[row][mid]) {
                return true ;
            } else if(target > mat[row][mid]) {
                st = mid + 1 ;
            } else {
                end = mid - 1 ;
            }
         }
         return false ;
    }

        // BS on total rows ->
    public static boolean searchMatrix(int[][] mat, int target) { // TC -> O(logm)
        int m = mat.length, n = mat[0].length ;

        int startRow = 0, endRow = m-1 ;
        while(startRow <= endRow) {
            int midRow = startRow + (endRow - startRow) / 2;

            if(target >= mat[midRow][0] && target <= mat[midRow][n-1]) {
                // function to apply BS on row
               return searchInRow(mat, target, midRow) ;
                // found the row => BS on this row
            } else if(target >= mat[midRow][n-1]) {
                // down => right
                startRow = midRow + 1 ;
            } else {
                // up => left
                endRow = midRow - 1 ;
            }
        }

        return false ;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}} ;
        int target = 3 ;

        System.out.println(searchMatrix(mat, target));
    }
}
