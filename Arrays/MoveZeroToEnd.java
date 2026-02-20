public class MoveZeroToEnd {
   
   // Time Complexity -> O(n) and extra space used

   // public static void movezeroToEnd(int[] arr) {
   //   int n = arr.length ;
   //   int[] temp = new int[n] ; 
   //   int idx = 0 ;
     
   //   for(int i=0; i<n; i++) {
   //      if(arr[i] != 0) {
   //          temp[idx] = arr[i] ;
   //          idx++ ;
   //      }
   //   }
   //   for(int i=0; i<n; i++) {
   //      arr[i] = temp[i] ;
   //      System.out.print(arr[i]+" ");
   //   }
   // }

   // public static void moveZeroToEnd(int[] arr) {
   //     int n = arr.length ;
   //     int idx = 0 ;
   //     for(int i=0; i<n; i++) {
   //       if(arr[i] != 0) {
   //        arr[idx] = arr[i] ;
   //        idx++ ;
   //       }
   //    }
   //    while(idx < n) {
   //       arr[idx] = 0 ;
   //       idx++ ;
   //    }

   //    for(int i=0; i<n; i++) {
   //       System.out.print(arr[i]+" ");
   //    }


   // optimal solution 
   // TC -> O(n)
   // SC -> O(1)
    public void moveZeroes(int[] nums) {
        int n = nums.length ;
        int i = 0 ; // to track non-zero number in array
        for(int j=0; j<n; j++) {
            if(nums[j] != 0) {
                nums[i] = nums[j] ; // to place number in front of array
                i++ ;
            }
        }
        // run a loop to make remaining element zero
        // to avoid duplicates
        for(int k=i; k<n; k++) { 
            nums[k] = 0 ;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12} ;
        //   moveZeroToEnd(arr);
    }
}
