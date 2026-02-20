import java.util.ArrayList;
public class RotatedAndDuplicates {

    // public static int removeDuplicates(int[] nums) {
    //    int i = 0;
    //    for(int j=1; j<nums.length; j++) {
    //      if(nums[i] != nums[j]) {
    //       i++ ;
    //       nums[i] = nums[j] ;
    //      }
    //    }
    //    return i+1 ;
    // }

    // public static void leftShiftByOne(int[] nums) {
    //   int n = nums.length ;
    //    int temp = nums[0] ;
    //    for(int i=1; i<n; i++) {
    //       nums[i-1] = nums[i] ;
    //    }
    //    nums[n-1] = temp ;

    //    for(int i=0; i<n; i++) {
    //     System.out.print(nums[i]+" ");
    //    }
    // }



    // bruteforce soution
    // TC -> O(nlogn) + n
    // SC -> O(n) 

    // optimal approach ->
    // TC -> O(n)
    // SC -> O(1)

//      public static int removeDuplicates(int[] nums) {
//         int n = nums.length ;
//         int i = 0 ;
//         // run a loop.
//         for(int j=1; j<n; j++) {
//             if(nums[j] != nums[i]) { //if current element is unique then place it to front of i index. 
//             // then increase i.
//               nums[i+1] = nums[j];
//                 i++ ;
//             }
//         }
//         return i+1 ; // i+1 will give correct answer because i start with 0.
//     }
// public static void main(String[] args) {
//   int[] arr = {0,0,1,1,1,2,2,3,3,4} ;

//   int ans = removeDuplicates(arr) ;
//   System.out.println(ans);

// }


// // leftShiftbyOne ->

// public static void leftShiftByOne(int[] arr) {
//   int n = arr.length;
//   int temp = arr[0] ;
  
//   // run a loop
//   for(int i=1; i<n; i++) {
//     arr[i-1] = arr[i] ;
//   }
//   arr[n-1] = temp ; // for last index we store separate value # edge case first element move to last

//   for(int j=0; j<n; j++) {
//     System.out.print(arr[j]+" ");
//   }
// }

// leftShiftByD ->


//*****/ very Imp ->  for every array number of rotation is d = d % n .

// TC -> O(d)+O(n-d)+O(d) -> O(n+d)
// SC -> O(d)
// static void leftRotateByD(int[] arr, int d) {
  
//   int[] temp = new int[d] ;
//   int n = arr.length ;
//       d = d % n ;
//   // using temp array to store value till d-1 place
//   for(int i=0; i<d; i++) {
//       temp[i] = arr[i] ;
//   }

//   // shift remaining number from d place to i-d place 
//   for(int i=d; i<n; i++) {
//     arr[i-d] = arr[i] ;
//   }

//   // then put it back from temp to original array
//   for(int j=n-d; j<n; j++) {
//     arr[j] = temp[j-(n-d)] ;
//   }

//   // print array
//   for(int i=0; i<n; i++) {
//     System.out.print(arr[i]+" ");
//   }

// }

s

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7} ;
    int d = 3 ;

    leftShiftByD(arr, d);
  }
}
