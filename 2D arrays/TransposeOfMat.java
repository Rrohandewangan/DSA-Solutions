public class TransposeOfMat {
    
    // TC -> O(n2)
    // SC -> o(n2)
    public int[][] transpose(int[][] mat) {
        int m = mat.length ;
        int n = mat[0].length ;
        int[][] ans = new int[n][m] ;

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                ans[j][i] = mat[i][j] ;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        
    }
}
