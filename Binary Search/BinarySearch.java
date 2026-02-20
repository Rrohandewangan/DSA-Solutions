public class BinarySearch {
   
    // Iterative method 
    // Time Complexity -> O(logn)
    // public static int binarySearch(int[] arr, int tar) { 
    //    int st = 0 , end = arr.length -1 ;
    //    while(st <= end) {
    //     int mid = st + (end - st) / 2 
    //     if(tar > arr[mid]) { // 2nd half
    //         st = mid + 1 ;
    //     } else if(tar < arr[mid]) { // 1st half
    //         end = mid - 1 ;
    //     } else {
    //         return mid ;
    //     }
    //    } 
    //    return -1 ;
    // }

    // Recursive Method 
     public static int recBinarySearch(int[] arr, int tar, int st, int end) {
        if(st <= end) {
           int mid = st + (end - st) / 2 ;
           if(tar > arr[mid]) {
             return recBinarySearch(arr, tar, mid+1, end) ;
           } else if(tar < arr[mid]) {
             return recBinarySearch(arr, tar, st, mid-1) ;
           } else {
             return mid ;
           }
        }
        return -1 ;

     }

     // search element in sorted rotated array  with Time Complexity -> O(logn) 
      public static int search(int[] nums, int target) {
        int st = 0; 
        int end = nums.length - 1 ;
        while(st <= end) {
            int mid = st + (end - st)/2 ; 
            if(nums[mid] == target) {
                return mid ;
            }
            if(nums[st] <= nums[mid]) { // left sorted
             if(nums[st] <= target && target <= nums[mid]) {
                 end = mid - 1 ;
             } else {
                st = mid + 1 ; 
             }
            } else { // right sorted
                if(nums[mid] <= target && target <= nums[end]) {
                    st = mid + 1 ;
                } else {
                    end = mid - 1 ;
                }
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        
        int arr1[] = {-1, 0, 3, 4, 5, 9, 12} ; // odd
        int tar1 = 12  ;


        int arr2[] = { 0, 3, 5, 9, 12, 1} ; // even 
        int tar2 = 9 ;
       System.out.println(search(arr2, tar2));
    }
}
