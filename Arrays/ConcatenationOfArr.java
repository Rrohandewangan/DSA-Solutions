public class ConcatenationOfArr {
    
    // better approach nut uses 2 passes ->
    // TC -> O(2n)
    // SC -> O(2n)
    // public int[] getConcatenation(int[] nums) {
    //     int n = nums.length ;
    //     int[] ans = new int[2*n] ;

    //     for(int i=0; i<n; i++) {
    //         ans[i] = nums[i] ;
    //     }
    //     int idx = n, i = 0;
    //     while(idx < ans.length && i < n) {
    //         ans[idx] = nums[i] ;
    //         idx++; i++ ;
    //     }

    //     return ans ;
    // }

    // optimal approach -> 
    // TC -> O(n)
    // SC -> O(2n)
    public int[] getConcatenation(int[] nums) {
        int n = nums.length ;
        int[] ans = new int[2*n] ;

        for(int i=0; i<n; i++) {
            ans[i] = nums[i] ;
            ans[i + n] = nums[i] ;
        }

        return ans ;
    }
    public static void main(String[] args) {
        
    }
}
