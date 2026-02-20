public class SearchIn2DMatrix2 {

     // we take corner value as starting point then move left or down . stair case 
    // TC -> O(n + m)
    // SC -> O(1)
    public static boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length, n = mat[0].length ;

        int row = 0, col = n - 1 ;
        while(row < m && col >= 0) {
            if(target == mat[row][col]) {
                return true ;
            } else if(target < mat[row][col]) {
                col-- ;
            } else {
                row++ ;
            }
        }
        return false ;
    }
  public static void main(String[] args) {
    int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}} ;
     int target = 5 ;

     System.out.println(searchMatrix(matrix, target));
  }
    
}
