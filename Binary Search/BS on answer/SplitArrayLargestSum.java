public class SplitArrayLargestSum {

    // TC -> O(n + log(sum(nums)))
    // SC -> O(1)
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int st = 0 ; 
        int end = 0 ;

        for(int i=0; i<n; i++) {
            // to store max of array or starting point ans of range
            st = Math.max(st, nums[i]);
            // to store sum of array or ending of point ans
            end += nums[i] ;
        }
        
        // binary search
        while(st < end) {
            int mid = st + (end-st)/2 ;
        
        // calculate how many pieces you can divide this in with this max sum 
        int sum = 0 ;
        int pieces = 1 ;
        for(int num : nums) {
            if(sum + num > mid) {
                // you cannot add this in this subarray, make new one
                // say you add this num in new subarray, then sum = num 
                sum = num ;
                pieces++ ;
            } else {
                sum += num;
            }
        }
         
         if(pieces > k) {
            st = mid + 1 ;
         } else {
            end = mid  ;
         }
        }
        return st ; // st == end
    }
    public static void main(String[] args) {
       int[] nums = {7,2,5,10,8} ; 
       int k = 2 ;
    }
}