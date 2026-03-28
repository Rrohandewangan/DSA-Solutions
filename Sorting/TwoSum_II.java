public class TwoSum_II {
    
    // TC -> O(n)
    // SC -> O(1)
     public int[] twoSum(int[] nums, int target) {
        int st = 0, end = nums.length - 1 ;
        while(st <= end) {
            if(nums[st] + nums[end] == target) {
                return new int[]{st + 1, end + 1} ;
            } else if(nums[st] + nums[end] > target) {
                end-- ;
            } else {
                st++ ;
            }
        }
        return new int[]{-1, -1} ;
    }

    public static void main(String[] args) {
        
    }

}
