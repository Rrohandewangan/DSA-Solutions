public class DigonalSum {
    
    // TC -> O(n)
    // SC - O(1)
    public int diagonalSum(int[][] mat) {
        int m = mat.length ;
        int n = mat[0].length ;
        int sum =  0;
        int r = 0, c = 0;
        while(r < m && c < n) {
            sum += mat[r][c] ;
            r++; c++ ;
        }

        int secR = 0, secC = mat[0].length-1 ;
        while(secR < mat.length && secC >= 0) {
            if(secR != secC) {
                sum += mat[secR][secC] ;
            }
            secR++; secC-- ;
        }

        return sum ;
    }

    // most optimal approach -> 
    // TC -> O(n)
    // SC -> O(1)
    public int diagonalSum(int[][] mat) {
        int n = mat.length ;
        int sum = 0 ;
        for(int i=0; i<n; i++) {
            sum += mat[i][i];
            if(i != n - i - 1) {
                sum += mat[i][n-i-1] ;
            }
        }
        return sum ;
    }
    public static void main(String[] args) {
        
    }
}
