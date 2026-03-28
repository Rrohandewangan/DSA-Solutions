public class CheckRotatedMat {
    
     // Tc -> O(n2)
    // SC -> O(1)
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int k=0; k<4; k++) {
            if(isEqual(mat, target)) return true ;
            mat = rotate(mat) ;
        }
        return false ;
    }

    private int[][] rotate(int[][] mat) {
        int n = mat.length ;
        int[][] ans = new int[n][n] ;

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                ans[j][n-i-1] = mat[i][j];
            }
        }

        return ans ;
    }

    static boolean isEqual(int[][] A, int[][] B) {
        int n = A.length ;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(A[i][j] != B[i][j]) {
                    return false ;
                }
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        
    }
}
