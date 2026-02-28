public class findDuplicateNumbers {
    
    // TC -> O(2n)
    // SC -> O(1)
    // //MY method my thinking
    // public int findDuplicate(int[] nums) {
    //     int n = nums.length ;
    //     int i = 0 ;
    //     while(i < n) {
    //         int correctIdx = nums[i] - 1 ;
    //          if(nums[i] != nums[correctIdx]) {
    //             swap(nums, i, correctIdx) ;
    //         } else {
    //             i++ ;
    //         }
       
    //     // find duplicate number in array
    //     for(int idx =0; idx<n; idx++) {
    //         if(nums[idx] - 1 != idx) {
    //             return nums[idx] ;
    //         }
    //     }
    //     return -1 ;
    // }


    /// method by kunal 

    //   public int findDuplicate(int[] nums) {
    //     int n = nums.length ;
    //     int i = 0 ;
    //     while(i < n) {

    //     if(nums[i] != i + 1) {
    //         int correctIdx = nums[i] - 1 ;
    //         if(nums[i] != nums[correctIdx]) {
    //             swap(nums, i, correctIdx) ;
    //         } else {
    //             return nums[i] ;
    //         }
    //     } else {
    //         i++ ;
    //     }
    //  } 
    //  return -1 ;
    // }

    // public void swap(int[] nums, int first, int second) {
    //            int temp = nums[first] ;
    //            nums[first] = nums[second] ;
    //            nums[second] = temp ;
    // }


    // TC -> O(n)
    // SC -> O(1)
    // public int findDuplicate(int[] nums) {
        // HashSet<Integer> set = new HashSet<>() ;

        // for(int val : nums) {
        //     if(set.contains(val)) {
        //         return val ;
        //     }
        //     set.add(val) ;
        // }
        // return -1 ;


        // slow - fast pointer approach -> 
    //     int slow = nums[0] , fast = nums[0] ;

    //     do {
    //         slow = nums[slow] ; // +1
    //         fast = nums[nums[fast]] ; // +2
    //     } while(slow != fast) ;

    //     slow = nums[0] ;
    //     while(slow != fast) {
    //         slow = nums[slow] ; // +1
    //         fast = nums[fast] ; // +1
    //     }
    //     return fast ; // or slow ;
    // }
    public static void main(String[] args) {
        
    }
}
