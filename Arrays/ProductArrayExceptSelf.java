public class ProductArrayExceptSelf {

    // brute force approach.
    // TC -> O(n2)
    // sc -> O(1)
    // public static int[] productExceptSelf(int[] nums) {
    //     int n = nums.length ;
    //     int[] ans = new int[n] ;

    //     for(int i=0; i<n; i++) {
    //          ans[i] = 1 ; // intially java index is o so we can i replace it with 1.
    //          // so multiply with another value is not give zero.
    //         for(int j=0; j<n; j++) {
    //             if(i != j) {
    //                 ans[i] *= nums[j] ;
    //             }
    //         }
    //     }
    //     return ans;
    // }


    // better approach ->
    // Tc -> O(n)
    // sc -> O(n)
    //  public static int[] productExceptSelf(int[] nums) {
    //     int n = nums.length ;
    //     int[] ans = new int[n] ;
    //     int[] prefix = new int[n] ;
    //     int[] suffix = new int[n] ;

    //     // prefix 
    //     prefix[0] = 1 ;
    //     for(int i=1; i<n; i++) {
    //         prefix[i] = prefix[i-1] * nums[i-1] ;
    //     }

    //     // suffix
    //     suffix[n-1] = 1 ;
    //      for(int i=n-2; i>=0; i--) {
    //         suffix[i] = suffix[i+1] * nums[i+1] ;
    //     }
 
    //     // ans array
    //     for(int i=0; i<n; i++) {
    //         ans[i] = prefix[i] * suffix[i] ;
    //     }
    //     return ans ;
    // }

    

    // optimal approach ->
      // TC -> O(n)
    // SC -> O(1)

    // approach -> first store then multiply to ans intead of this we directly multiply prefix & suffix to ans array.
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length ;
        int[] ans = new int[n] ;
         ans[0] = 1 ;
        // prefix =>
        for(int i=1; i<n; i++) {
            ans[i] = ans[i-1] * nums[i-1] ;
        }

        // suffix
         int suffix = 1 ;
         for(int i=n-2; i>=0; i--) {
            suffix *= nums[i+1] ;
            ans[i] *= suffix ;
        }
 
        return ans ;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4} ;
        System.out.println(productExceptSelf(nums));
    }
}
