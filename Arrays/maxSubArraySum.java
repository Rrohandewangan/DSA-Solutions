public class maxSubArraySum {

    // code for print all subArray of array 
    // Time Complexity -> O(n3) ;

    //   int[] arr = {1, 2, 3, 4, 5} ;
    //    int n = arr.length ;

    //    for(int st=0; st<n; st++) {
    //     for(int end=st; end<n; end++) {
    //         for(int i=st; i<=end; i++) {
    //             System.out.print(arr[i]);
    //         }
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    //    }
 
    // Time Complexity -> O(n3)
    // public static int maxSubArraySum(int[] nums) {
    //     int n = nums.length ;
    //     int maxSum = 0 ;
    //     for(int st=0; st<n; st++) {
    //        for(int end=st; end<n; end++) {
    //            int currSum = 0 ;
    //           for(int i=st; i<=end; i++) {
    //             currSum += nums[i] ;
    //            }
    //           maxSum = Math.max(currSum, maxSum) ;
    //        }
    //     }
    //     return maxSum ;
    // }

    
    // Time Complexity -> O(n2) 
    // public static int maxSubArraySum(int arr[]) {
    //     int n = arr.length ;
    //     int maxSum = Integer.MIN_VALUE;
    //     for(int st=0; st<n; st++) {
    //         int currSum = 0; 
    //         for(int end=st; end<n; end++) {
    //            currSum += arr[end] ;
    //            maxSum = Math.max(currSum, maxSum) ;
    //         }
    //     }
    //     return maxSum ;
    // }

    // // kadanes algorithm 
    // public static int maxSubArraySum(int[] arr) {
    //     int currSum = 0, maxSum = Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++) {
    //         currSum += arr[i] ;
    //         maxSum = Math.max(currSum, maxSum) ;
      
    //      logic -> currSum is -ve condition check in last because in edge case we find atleast one time maxSum..
    //         if(currSum < 0) {   
    //             currSum = 0 ;
    //         }
    //     }
    //     return maxSum ;

    // }
    // public static void main(String[] args) {
      
    //     int[] arr = {3, -4, 5, 4, -1, 7, -8} ;
    //     int n = arr.length ;

    //     System.out.println(maxSubArraySum(arr));
    // }


    static int maxSubArraySum(int[] arr) {
        int n = arr.length ;
        int maxSum = Integer.MIN_VALUE ;
        int currSum = 0 ;
        for(int val : arr) {
            currSum += val ;
            maxSum = Math.max(currSum, maxSum) ;
            if(currSum < 0) {
                currSum = 0 ;
            }
        }
        return maxSum ;
    }
    public static void main(String[] args) {
        int[] arr = {3, -4, 5, 4, -1, 7, -8} ;
       
        int ans = maxSubArraySum(arr) ;
        System.out.println(ans);
    }
}
