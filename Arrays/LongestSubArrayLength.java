public class LongestSubArrayLength {
   
    // Time Complexity -> O(n3)

    // public static int longestSubArrayLength(int[] arr, int k) {
    //     int n = arr.length ;
    //      int length = 0 ;
    //      for(int st=0; st<n; st++) {
    //         for(int end=st; end<n; end++) {
                
    //             int currSum = 0 ;
    //             for(int i=st; i<=end; i++) {
    //                 currSum += arr[i] ;
    //             }
    //             if(currSum == k) {
    //             length = Math.max(length, end-st+1) ;
    //             }
    //         }
    //      }
    //      return length ;
    // }

   
 // Time Complexity -> O(n2)
   //  public static int longestSubArrayLength(int[] arr, int k) {
   //      int n = arr.length ;
   //       int length = 0 ;
   //      for(int st=0; st<n; st++) {
   //         int currSum = 0 ;
   //         for(int end=st; end<n; end++) {
   //           currSum += arr[end] ;
   //           if(currSum == k) {
   //              length = Math.max(length, end-st+1) ;
   //           }
   //         }
   //      }
   //      return length ;

   //   }

   
   // Brute Force apporach ->
   // TC -> O(n3)
   // SC -> O(1)

   // public static int longestSubArrayLength(int[] arr, int k) {
   //    int n = arr.length ;
   //    int len = 0 ; //// use len var to store longest subarray length
   //    for(int st=0; st < n; st++) {
   //       // for every value of st inner loop run from st to n-1 . 
   //       for(int end=st; end<n; end++) {
   //          int currSum=0 ;
   //          // for every value of end, i run for all value of end. 
   //          for(int i=end; i<=end; i++) {
   //             currSum += arr[k] ;
//                }
   //             if(currSum == k) {
   //               len = Math.max(len, end-st+1) ;
   //             }
   //          }
   //       }
   //    }
   //    return len ;
   // }

   // // Better apporach
   // // TC -> O(n2)
   // // SC -> O(1)
   // public static int longestSubArrayLength(int[] arr, int k) {
   //    int n = arr.length ;
   //    int len = 0 ;
   //    for(int st=0; st < n; st++) {
   //       // for every value of st inner loop run from st to n-1 .
   //       // use len var to store longest subarray length
   //          int currSum=0; 
   //       for(int end=st; end<n; end++) {
   //          currSum += arr[end] ;
   //          // check for length is equal to k
   //          if(currSum == k) {
   //             len = Math.max(len, end-st+1) ;
   //          }
   //       }
   //       }
   //       return len ;
   //       }
      

   // apna college mam apporach
   // brute force ->
   // TC -> O(n2) 
   // SC -> O(1)

   // public static int subarraySum(int[] nums, int k) {
   //      int n = nums.length ;
   //      int count = 0 ;

   //      for(int i=0; i<n; i++) { // starting point 
   //          int sum = 0; 
   //          for(int j=i; j<n; j++) { // ending point
   //              sum += nums[j] ;
   //              if(sum == k) {
   //                  count++ ;
   //              }
   //          }
   //      }
   //      return count ;
   //  }


   // optimal apporach
   // TC -> O(2n)
   // SC -> O(1)
   // inner while loop not running every time
     public static int longestSubArrayLength(int[] arr, int k) {
        int n = arr.length ;
        int left = 0, right = 0 ;
        int sum = arr[0] ; // 
        int len = 0 ;
        // run a loop till right pointer is less than array length
        while(right < n) {
            // trim from left side if sum exceed k.
            while(left <= right && sum > k) {
                sum -= arr[left] ;
                left++ ; // to move next index
            }
            // if sum is equal to k store it in len.
            if(sum == k) { 
                len = Math.max(len, right-left+1) ;
            }
            // if sum is less than k do right++ 
            // check every time before adding arr[right].
            // because of edge case and last index gived out of bound error.
            right++ ;
            if(right < n) {
                sum += arr[right] ;
            }  
        }
        return len ;
    }
      






    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,3,3} ;
         int k = 6 ;
         int ans = longestSubArrayLength(arr, k) ;
         System.out.println(ans);
    }
}
