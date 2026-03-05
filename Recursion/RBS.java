public class RBS {

    // TC -> O(log2(n))
    // SC -> O(log2(n))
   static int search(int[] nums, int target) {
    return helper(nums, target, 0, nums.length -1) ;
   }
    
   private static int helper(int[] nums, int target, int s, int e) {
        if(s > e) {
            return -1 ;
        }

        int mid = s + (e - s) / 2 ;
        if(nums[mid] == target) {
            return mid ;
        }

        if(nums[s] <= nums[mid]) {
            if(target >= nums[s] && target <= nums[mid]) {
                return helper(nums, target, s, mid - 1) ;
            } else {
                return helper(nums, target, mid + 1, e) ;
            }
        } 

        if(target >= nums[mid] && target <= nums[e]) {
            return helper(nums, target, mid + 1, e) ;
        } 
        return helper(nums, target, s, mid -1);
    }
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 9, 1, 2, 3} ;
        System.out.println(helper(nums, 8, 0, nums.length - 1));
    }
}
