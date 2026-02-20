import java.util.Arrays;

public class majorityElement {
    // Time Complexity -> O(n2) 
//    public static int majorityElement(int[] nums) {   
//      int n = nums.length ;
//      for(int val: nums) {
//        int freq = 0 ;
//        for(int el : nums) {
//            if(val == el) {
//                freq++ ;
//            }
//        }   
//      if(freq > n/2) {  
//         return val ;   
//       }
      
//      }
//      return -1 ;  
//    }
 
    // Time Complexity -> O(nlogn)
    // sort the array then run loop
    // public static int majorityElement(int[] nums) {
    //     int n = nums.length ;
    //     Arrays.sort(nums);
    //      int freq = 1 ;
    //      int ans = nums[0] ;
    //     for(int i=1; i<n; i++) {
    //         if(nums[i] == nums[i-1]) {
    //             freq++ ;
    //         } else {
    //             freq = 1 ;
    //             ans = nums[i] ;
    //         }
    //         if(freq > n/2) {
    //             return ans ;
    //         }
    //     }
    //     return ans ;
    // }
     
    ////// moore's voting alogorithm//////// ->  according to algo majority element in array always keep freq > 0 .
    // Time Complexity -> O(n) 
    // public static int majorityElement(int nums[]) {
    //     int n = nums.length ;
    //      int freq = 0 , ans = 0 ;
    //      for(int i=0; i<n; i++) {
    //         if(freq == 0) {
    //             ans = nums[i] ;
    //         }
    //         if(ans == nums[i]) {
    //             freq++ ;
    //         } else {
    //             freq-- ;
    //         }
    //      }
    //      return ans ;
    // }
    public static void main(String[] args) {
          int nums[] = {3, 2, 3} ;
          System.out.println(majorityElement(nums));
    }
}
