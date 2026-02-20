public class SubArraySumEqualsToK {
   
// Time Complexity -> O(n3) // brute force approach
//    public static int subarraySum(int[] nums, int k) {
//         int n = nums.length ;
//         int count = 0 ;
//         for(int st=0; st<n; st++) {
//             for(int end=st; end<n; end++) {
//                 int currSum = 0 ;
//                 for(int i=st; i<=end; i++) {
//                     currSum += nums[i] ; 
//                 }
//                 if(currSum == k) {
//                     count++ ;
//                 }
//             }
//         }
//         return count ;
//     }

 // TC O(n2) // better approach
//  public static int subarraySum(int[] nums, int k) {
//    int n = nums.length ;
//        int count = 0 ;
//        for(int st=0; st<n; st++) {
//          int currSum = 0 ;
//         for(int end=st; end<n; end++) {
//                currSum += nums[end] ;
//                if(currSum == k) {
//                  count++ ;
//                }
//         }
//     }
//     return count ;

// }

 public static int subarraySum(int[] nums, int k) {
    int n = nums.length ;
    int count = 0;
    int i = 0; 
    int currSum = 0 ;

  
 }


    public static void main(String[] args) {
        int[] nums = {1,2,3} ;
        int k = 3 ;
        System.out.println(subarraySum(nums, 2));

     }
}