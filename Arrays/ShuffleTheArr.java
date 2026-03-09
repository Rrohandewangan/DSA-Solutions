public class ShuffleTheArr {

    // TC -> o(n)
    // SC -> o(n)
    //  public static int[] shuffle(int[] nums, int n) {
    //     int[] ans = new int[2 * n] ;

    //     for(int i=0; i<n; i++) {
    //         ans[2 * i] = nums[i] ;
    //         ans[2 * i + 1] = nums[i + n] ;
    //     }
    //     return ans ;
    // }

    

    /// method 2 using 2 pointers approach ->
    /// TC -> O(n)
    /// SC -> O(n)
    // public int[] shuffle(int[] nums, int n) {
    //     int[] ans = new int[2 * n] ;
    //     int i=0, j=n, k=0 ;
    //     while(i < n) {
    //         ans[k] = nums[i] ;
    //         ans[k+1] = nums[j] ;
    //         i++; j++; k += 2 ;
    //     }
    //     return ans ;
    // }
    
    public static void main(String[] args) {
        
    }
}