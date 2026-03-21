public class CountOddcellMat {
    
    // brute force appraoch ->
    // TC ->O(m * n + (m + n) * indices.length)
    // SC -. O(m * n)
    // public int oddCells(int m, int n, int[][] indices) {
    //     int[][] mat = new int[m][n] ;

    //     for(int[] idx : indices) {
    //        int r = idx[0] ;
    //        int c = idx[1] ;

    //         for(int j=0; j<n; j++) {
    //         mat[r][j]++ ;
    //         }

    //        for(int i=0; i<m; i++) {
    //         mat[i][c]++ ;
    //        }
    //     }

    //     int count = 0 ;
    //     for(int i=0; i<m; i++) {
    //         for(int j=0; j<n; j++) {
    //             if(mat[i][j] % 2 == 1) {
    //                 count++ ;
    //             }
    //         }
    //     }
    //     return count ;
    // }


    // better approach -> 
    // TC ->O(m * n + indices.length)
    // SC -. O(m * n)
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m] ;
        int[] col = new int[n] ;

        for(int[] idx : indices) {
            row[idx[0]]++ ;
            col[idx[1]]++ ;
        }

        int count = 0 ;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if((row[i] + col[j]) % 2 == 1) {
                    count++ ;
                }
            }
        }
        return count ;
    }

     // TC ->O(m + n + indices.length)
    // SC -. O(m + n)
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m] ;
        int[] col = new int[n] ;

        for(int[] idx : indices) {
            row[idx[0]]++ ;
            col[idx[1]]++ ;
        }

        int oddRows = 0 ; int oddCols = 0 ;
        
        for(int r : row)  {
            if(r % 2 != 0) oddRows++ ;
        }

        for(int c : col) {
            if(c % 2 != 0) oddCols++ ;
        }

        return oddCols * (m - oddRows) + oddRows * (n - oddCols) ;
        
    }
    public static void main(String[] args) {
        
    }
}
