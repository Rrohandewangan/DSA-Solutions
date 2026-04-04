public class CountNegNumInMat {
    

    // TC -> O(m + n)
    // SC -> O(1)
    public int countNegatives(int[][] grid) {
         int count = 0 ;
         for(int i=0; i<grid.length; i++) {
            int st = 0, end = grid[0].length - 1 ;
            int firstNegIdx = grid[0].length ;

            while(st <= end) {
                int mid = st + (end - st) / 2 ;

                if(grid[i][mid] < 0) {
                    firstNegIdx = mid ;
                    end = mid - 1 ;
                } else {
                    st = mid + 1 ;
                }
            }
            count += grid[0].length - firstNegIdx ;
         }
         return count ;
    }



    // brute force approach ->
    // TC -> O(m * n)
    // SC -> O(1)
    public int countNegatives(int[][] grid) {
         int count = 0 ;
         for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] < 0) {
                    count++ ;
                }
            }
         }
         return count ;
    }
    public static void main(String[] args) {
        
    }
}
