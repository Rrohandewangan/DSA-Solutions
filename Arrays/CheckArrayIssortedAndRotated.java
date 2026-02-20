public class CheckArrayIssortedAndRotated {

    // TC - O(n)
     public static boolean check(int[] nums) {
        int n = nums.length ;
        int breakPoint = 0 ; // means break the sorted order of array(arr[i]>arr[i+1])
        for(int i=1; i<n; i++) { // check except first index 
            if(nums[i-1] >= nums[i]) { // check how many times breakpoint occur
                breakPoint++ ;
            }
        }
        if(nums[n-1] > nums[0]){ // check first index because of edge case
           breakPoint++ ;
        }
        
        if(breakPoint > 1) {
            return false ;
        } else {
            return true ;
        }
    }
    public static void main(String[] args) {
        int[] nums = {5, 1, 5, 1} ;
        System.out.println(check(nums));
    }
    
}