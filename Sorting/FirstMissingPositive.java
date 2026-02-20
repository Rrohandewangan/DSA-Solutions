public class FirstMissingPositive {
    
     public int firstMissingPositive(int[] nums) {
        int n = nums.length ;
        int idx = 0;
        while(idx < nums.length) {
            int correctIdx = nums[idx] - 1 ;
            if(nums[idx] > 0 && nums[idx] <= n && nums[idx] != nums[correctIdx]) {
                swap(nums, idx, correctIdx) ;
            } else {
                idx++ ; 
            }
        }
        // search for fist missing number
        for(int i=0; i<n; i++) {
            if(nums[i] != i + 1) {
                return i + 1 ;
            }
        }
        // case 2
        return n + 1 ;
    } 

    public void swap(int[] arr, int first, int second) {
            int temp = arr[first] ;
            arr[first] = arr[second] ;
            arr[second] = temp ;
    }
    public static void main(String[] args) {
        
    }
}
