import java.util.HashSet;

public class FindMissingAndRepeatingVal {

    // TC -> O(n2)
    // SC -> O(1)
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2] ;
        HashSet<Integer> set = new HashSet<>() ;
        int n = grid.length ;
        int m = grid[0].length ;
        int a = 0, b = 0 ;

        int expSum = 0, actualSum = 0 ;

       // find duplicate element in grid 
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                actualSum += grid[i][j] ;
                if(set.contains(grid[i][j])) {
                    a = grid[i][j] ;
                    ans[0] = a ;
                }
                set.add(grid[i][j]) ;
            }
        }

        expSum = (n*n) * ((n * n) + 1) / 2 ;
        b = expSum + a - actualSum ;
        ans[1] = b ;

        return ans ;
    }
    
    public static void main(String[] args) {
        int[][] grid  = {{1, 3},{2,2}} ;
    }
}
