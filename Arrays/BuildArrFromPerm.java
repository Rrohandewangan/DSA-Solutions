public class BuildArrFromPerm {
 
    // brute force -> 
     // TC -> O(n)
     // SC -> O(n)
     public static int[] buildArray(int[] nums) {
        int n = nums.length ;
        int[] ans = new int[n] ;

        for(int i=0; i<n; i++) {
            ans[i] = nums[nums[i]] ;
        }

        return ans ;
    }

    // optimal approach ->
    // TC -> O(n)
    // SC -> O(1)
    public int[] buildArray(int[] nums) {
        int n = nums.length ;
       
       // run a loop for encoding the old value and new value in same index
       for(int i=0; i<n; i++) {
         nums[i] = nums[i] + n * (nums[nums[i]] % n) ;  // formula
       }

       // second loop to get new value from encoded value 
       for(int i=0; i<n; i++) {
        nums[i] = nums[i] / n ;
       }

        return nums ;
    }

    public static void main(String[] args) {
        
    }
}