public class SearchAndRotatedArray {
  
  // TC -> O(n)
  // public static int findIndex(int[] nums, int target) {
  //   int n = nums.length ;
  //     for(int i=0; i<n; i++) {
  //       if(nums[i] == target) {
  //           return i ;
  //       }
  //     }
  //     return -1 ;
  // }

  // TC -> (logn) // find index with no duplicates
  // public static int findIndex(int[] nums, int target) {
  //    int n = nums.length ;
  //    int st=0, end=n-1;
     
  //    while(st <= end) {
  //     int mid = st+(end-st)/2 ;

  //     if(nums[mid] == target) {
  //       return mid ;
  //     }

  //     if(nums[st] <= nums[mid]) {

  //       if(nums[st] <= target && target <= nums[mid]) {
  //           end = mid-1 ;
  //       } else {
  //          st = mid+1 ;
  //       }
  //     } else {
  //       if(nums[mid] <= target && target <= nums[end]) {
  //         st = mid+1 ;
  //       } else {
  //          end = mid-1 ;
  //       }
  //     }
  //    }
  //    return -1 ;
  // }

  // TC -> O(logn) give true or false 
  // public static boolean findIndex(int[] nums, int target) {
  //    int n = nums.length ;
  //    int st=0, end=n-1;
     
  //    while(st <= end) {
  //     int mid = st+(end-st)/2 ;

  //     if(nums[mid] == target) {
  //       return true ;
  //     }
  //     if(nums[st] == nums[mid] && nums[mid] == nums[end]) {
  //       st++ ;
  //       end-- ;
  //     }
  //    else if(nums[st] <= nums[mid]) {

  //       if(nums[st] <= target && target < nums[mid]) {
  //           end = mid-1 ;
  //       } else {
  //          st = mid+1 ;
  //       }
  //     } else {
  //       if(nums[mid] < target && target <= nums[end]) {
  //         st = mid+1 ;
  //       } else {
  //          end = mid-1 ;
  //       }
  //     }
  //    }
  //    return false ;
  // }



  // 2nd time solve 

  // this is not work for Duplicates...
   // public int findPivot(int[] nums) {
    //     int n = nums.length;
    //     int st = 0, end = n - 1 ;

    //     while(st <= end) {
    //         int mid = st + (end-st) / 2; 

    //         // 4 case 
        
    //        if(mid < end && nums[mid] > nums[mid + 1]){
    //         return mid ;
    //        } 
    //        if(mid > st && nums[mid] < nums[mid-1]){
    //         return mid-1 ;
    //        }
    //        if(nums[mid] <= nums[st]) {
    //         end = mid - 1 ;
    //        } else {
    //         st = mid + 1 ;
    //        }
    //     }
    //        return -1 ;
          
    //     }
    

    //  static int binarySearch(int[] nums, int target, int st, int end) { 
    //    while(st <= end) {
    //     int mid = st + (end - st) / 2 ;
    //     if(target > nums[mid]) { // 2nd half
    //         st = mid + 1 ;
    //     } else if(target < nums[mid]) { // 1st half
    //         end = mid - 1 ;
    //     } else {
    //         return mid ;
    //     }
    //    } 
    //    return -1 ;
    // }

    // public int search(int[] nums, int target) {
    //     int pivot = findPivot(nums) ;

    //     if(pivot == -1) {
    //         // just do normal BS
    //       return binarySearch(nums, target, 0, nums.length-1);
    //     }

    //     // if pivot is found, you hav found 2 asc sorted arrays
    //     if(nums[pivot] == target) {
    //         return pivot ;
    //     }

    //     if(target >= nums[0]) {
    //         return binarySearch(nums, target, 0, pivot - 1) ;
    //     } 

    //     return binarySearch(nums, target, pivot + 1, nums.length-1) ;
    // }


    // For duplicates wtih skip 1 element from both side (st++, end--)

    
     //public int findPivot(int[] nums) {
    //     int n = nums.length;
    //     int st = 0, end = n - 1 ;
            
            // skip duplicates
            // if(nums[st] == nums[mid] && nums[mid] == nums[end]) {
            
            // check if start is pivot
            // if(nums[st] > nums[st + 1]) {
            //   return st ;
            // }
            //   st++ ;

            // if end is pivot 
            // if(nums[end] < nums[end - 1]) {
            //   return end - 1 ;
            // }
            //   end-- ;
            // }

            // left side is sorted,so pivot should be in right
            // else if(nums[st] < nums[mid] || (nums[st] == nums[mid]  && nums[mid] > nums[end])) {
            //   st = mid + 1 ;
            // } else {
            //   end = mid - 1 ;
            // }
             //}

             
    //     while(st <= end) {
    //         int mid = st + (end-st) / 2; 

    //         // 4 case 
        
    //        if(mid < end && nums[mid] > nums[mid + 1]){
    //         return mid ;
    //        } 
    //        if(mid > st && nums[mid] < nums[mid-1]){
    //         return mid-1 ;
    //        }
    //        if(nums[mid] <= nums[st]) {
    //         end = mid - 1 ;
    //        } else {
    //         st = mid + 1 ;
    //        }
    //     }
    //        return -1 ;
          
    //     }
    

    public static void main(String[] args) {
       int[] nums = {1,0,1,1,1} ;
       int target = 0 ;
       System.out.println(findIndex(nums, target));

    }
}
