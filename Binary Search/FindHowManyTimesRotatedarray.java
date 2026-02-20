public class FindHowManyTimesRotatedarray {
    // TC-> o(n)
    // public static int findRotatedTimes(int[] arr) {
    //     int n = arr.length ;
    //     int min = Integer.MAX_VALUE ;
    //     int k = -1 ;

    //     for(int i=0; i<n; i++) {
    //       if(arr[i] < min) {
    //          min = arr[i] ;
    //          k = i ;
    //       }
    //     } 
    //     return k ;
    // }
    
    // TC -> o(logn)
    // public static int findRotatedTimes(int[] arr) {
    //     int n = arr.length ;
    //     int min = Integer.MAX_VALUE ;
    //     int k = -1 ;
    //     int st=0, end=n-1 ;

    //     while(st <= end) {
    //      int mid = st+(end-st)/2 ;

    //      if(arr[st] <= arr[mid]) {
    //         if(arr[st] < min) {
    //           min = arr[st] ;
    //           k = st ;
    //         }
    //         st = mid+1 ;
    //      } else {
    //         if(arr[mid] < min) {
    //           min = arr[mid] ;
    //           k = mid ;
    //         }
    //         end = mid-1 ;
    //      }
    //     }
    //     return k ;
    // }


    // 2nd method 
    // public int findRotatedTimes(int[] nums) {
    //     int n = nums.length;
    //     int st = 0, end = n - 1 ;
    //     int min = Integer.MAX_VALUE;
    //     int minIndex = 0 ;

    //     while(st <= end) {
    //         int mid = st + (end - st) / 2 ;

    //         if(nums[st] <= nums[mid]) {
    //             min = Math.min(min, nums[st]);
    //             minIndex = st ;
    //             st = mid + 1 ;
    //         } else {
    //             min = Math.min(min, nums[mid]);
    //             minIndex = mid ;
    //             end = mid - 1 ;
    //         }
    //     }   
        
    //      return minIndex ;
    // }


    // another method 
    public static int countRotations(int[] arr) {

      int pivot = findPivot(arr) ;
      if(pivot == -1) {
        // array is not rotated
        return 0 ;
      }
      return pivot + 1 ;
    }
    //this is not work with duplicates
     public static int findPivot(int[] arr) {
          int n = arr.length;
          int st = 0, end = n - 1 ; 
          while(st <= end) {
              int mid = st + (end-st) / 2; 
              // 4 case 
     
             if(mid < end && arr[mid] > arr[mid + 1]){
              return mid ;
             } 
             if(mid > st && arr[mid] < arr[mid-1]){
              return mid-1 ;
             }
             if(arr[mid] <= arr[st]) {
              end = mid - 1 ;
             } else {
              st = mid + 1 ;
             }
          }
             return -1 ;
       
          }
    

      // this is work with duplicates 
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
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3} ;

        // // System.out.println(findRotatedTimes(arr));
        // System.out.println(countRotations(arr));
    }

