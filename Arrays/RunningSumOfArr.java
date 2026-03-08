public class RunningSumOfArr {
    
    // brute force -> 
    // TC -> O(n2)
    // SC -> O(n)
    // public int[] runningSum(int[] nums) {
    //     int n = nums.length ;
    //     int[] ans = new int[n] ;
    //     for(int i=0; i<n; i++) {
    //         for(int j=0; j<=i; j++) {
    //             ans[i] += nums[j] ; 
    //         }
    //     }
    //     return ans ;
    // }


    // optimal approach -> 
    // TC -> O(n)
    // SC -> O(n)
    // public int[] runningSum(int[] nums) {
    //     int n = nums.length ;
    //     int[] ans = new int[n] ;
    //     ans[0] = nums[0] ;
    //     for(int i=1; i<n; i++) {
    //        ans[i] = ans[i-1] + nums[i] ;
    //     }
    //     return ans ;
    // }
    public static void main(String[] args) {
        
    }
}
