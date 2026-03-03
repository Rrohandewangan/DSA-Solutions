import java.util.HashMap;

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

// Optimal approach -> 
    // TC -> O(n)
    // SC -> O(n)
   //  public int subarraySum(int[] nums, int k) {
   //      int n = nums.length ;
   //      int count = 0 ;
   //      int prefixSum = 0 ; // to store prefixSum till ith index

   //      HashMap<Integer, Integer> map = new HashMap<>() ; // to store prefixsum and freq 
   //      map.put(0, 1) ;// very important base case 

   //      for(int i=0; i<n; i++) {
   //          prefixSum += nums[i] ;

   //          int remove = prefixSum - k ;

   //          if(map.containsKey(remove)) {
   //              count += map.get(remove) ;
   //          }
            
   //          // Update the frequency of the current prefix sum
   //          map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1) ;
   //      }

   //      return count ;
   //  }


   public static void main(String[] args) {
      int[] nums = {1,2,3} ;
      int k = 3 ;
      System.out.println(subarraySum(nums, 2));

   }
}