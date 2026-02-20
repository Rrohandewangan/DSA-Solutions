public class findDuplicateNumbers {
    
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

      public int findDuplicate(int[] nums) {
        int n = nums.length ;
        int i = 0 ;
        while(i < n) {

        if(nums[i] != i + 1) {
            int correctIdx = nums[i] - 1 ;
            if(nums[i] != nums[correctIdx]) {
                swap(nums, i, correctIdx) ;
            } else {
                return nums[i] ;
            }
        } else {
            i++ ;
        }
     } 
     return -1 ;
    }

    public void swap(int[] nums, int first, int second) {
               int temp = nums[first] ;
               nums[first] = nums[second] ;
               nums[second] = temp ;
    }
    public static void main(String[] args) {
        
    }
}
