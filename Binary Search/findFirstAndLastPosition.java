

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// imp points to note -> 

// for brute force -> 1. we make two methods one for firstIndex and lastIndex.
// 2. we run loop in array and find first and last index TC -> O(n)


  public class findFirstAndLastPosition {
  
//  public static int[] searchRange(int[] nums, int target, int n) { 
  
//     int firstIndex = findFirstIndex(nums, target, n) ;
//     int lastIndex = findLastIndex(nums, target, n) ;

//     return new int[] {firstIndex, lastIndex} ;
  
//  }

//  public static int findFirstIndex(int[] nums, int target, int n) {
     
//      int st=0, end = n-1 ;
//      int index = -1 ;
//      while(st <= end) {
//       int mid = st +(end - st) / 2 ;
      
//       if(nums[mid] >= target) {
//          end = mid-1 ;
//       } else {
//         st = mid+1 ;
//       }

//       if(nums[mid] == target) {
//         index = mid ;
//       }
//      }
//      return index ;
//  }
//  public static int findLastIndex(int[] nums, int target, int n) {
     
//      int st=0, end = n-1 ;
//      int index = -1 ;
//      while(st <= end) {
//       int mid = st +(end - st) / 2 ;
      
//       if(nums[mid] <= target) {
//          st = mid+1 ;
//       } else {
//         end = mid-1 ;
//       }

//       if(nums[mid] == target) {
//         index = mid ;
//       }
//      }
//      return index ;
//  }


// 2nd kunal khushwaha method ->

// TC -> O(logn)
// SC -> O(1)

// method 1 ->

  // public int[] searchRange(int[] nums, int target) {
  //       int firstIndex = firstIndex(nums, target) ;
  //       int lastIndex = lastIndex(nums, target) ;

  //       return new int[]{firstIndex, lastIndex} ;
  //   }

  //   // check for first occurrcence if target first
  //    public static int firstIndex(int[] nums, int target) {
  //       int n = nums.length ;
  //       int st = 0, end = n - 1 ;
  //       int ans = -1 ;

  //       while(st <= end) {
  //           int mid = st + (end - st) / 2 ;
            
  //           if(target <= nums[mid]) { // check point 
  //               end = mid - 1 ;
  //           } 
  //           else if(target > nums[mid]) {
  //               st = mid + 1 ;
  //           } 
  //           if(target == nums[mid]) {
  //               ans = mid ;
  //           }
  //       }
  //       return ans ;
  //    }
      
  //    // check for last occurrence if target is last
  //     public static int lastIndex(int[] nums, int target) {
  //       int n = nums.length ;
  //       int st = 0, end = n - 1 ;
  //       int ans = -1 ;

  //       while(st <= end) {
  //           int mid = st + (end - st) / 2 ;
            
  //           if(target < nums[mid]) {
  //               end = mid - 1 ;
  //           } 
  //           else if(target >= nums[mid]) {
  //               st = mid + 1 ;
  //           } 
  //           if(target == nums[mid]) {
  //               ans = mid ;
  //           }
  //       }
  //       return ans ;
  //    }


  // 2nd method ->

  // public static int[] searchRange(int[] nums, int target) {

  //       int[] ans = {-1, -1} ;

  //       // check for first occurrcence if target first 
  //       int start = search(nums, target, true) ;
  //       int end = search(nums, target, false)  ;

  //       ans[0] = start ;
  //       ans[1] = end ;

  //       return ans ;
  //   }

  //   // this function is just return the index  value of target
  //    public static int search(int[] nums, int target,  boolean findStartIndex) {
  //       int n = nums.length ;
  //       int st = 0, end = n - 1 ;
  //       int ans = -1 ;

  //       while(st <= end) {
  //           int mid = st + (end - st) / 2 ;
            
  //           if(target < nums[mid]) { // check point 
  //               end = mid - 1 ;
  //           } 
  //           else if(target > nums[mid]) {
  //               st = mid + 1 ;
  //           } 
  //           else {
  //             ans = mid ;
  //             if(findStartIndex) {
  //               end = mid - 1 ;
  //             } else {
  //               st = mid + 1 ;
  //             }
  //           }
            
  //       }
  //       return ans ;
  //    }


    /// Que.3 -> find the target in sorted array of infinite length.
    ///https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
    
    static int searchRange(int[] arr, int target) {
      // first find the range
      // first start with a box of size 2
      int start = 0 ;
      int end = 1 ;

      // condition for the target to lie the range 
      while(target > arr[end]) {
          int temp = end + 1 ; // this is my new start
          // double the box value
          // end = previous end + sizeofBox*2
          end = end + (end - start + 1) * 2 ;
          start = temp ;
          
      }
      return BinarySearch(arr, target, start, end) ;
    }

    public static int BinarySearch(int[] nums, int target, int start, int end) {

        int n = nums.length ;
       
        while(start <= end) {
            int mid = start + (end - start)/2 ;

            if(target < nums[mid]) {
                end = mid - 1 ;
            }
            else if(target > nums[mid]) {
                start = mid + 1 ;
            }
            else {
                return mid ;
            }
        }
        return -1 ;
    }
    
    public static void main(String[] args) {
      int[] nums = {2, 3, 4, 6, 8, 9, 10, 34, 45, 65, 98, 99, 101, 110};
      
      int target = 45 ;
      

      System.out.println(searchRange(nums, target));
      // int[] ans = searchRange(nums, target) ;
      // System.out.println(ans[0]+" "+ans[1]);
    }
  
  }