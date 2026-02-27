import java.util.* ;

public class Twosum {

  // brute force approach -> 
  // TC -> O(n2)
  // SC -> O(1)
  // public static int[] twoSum(int[] nums, int target) {
    
  //   for(int i=0; i<nums.length-1; i++) {
  //     for(int j=i+1; j<nums.length; j++) {
  //       if(nums[i] + nums[j] == target) {
  //         return new int[]{i, j} ;
  //       } 
        
  //     }
  //   }
  //    return new int[]{} ;
  // }


  // better approach -> using sorting and store element of array with its real index in other data structure.
  // TC -> O(nlogn)
  // SC -> O(n)
  // i am only learn this solution but dont code it do it by yourself...

  

  // optimal solution -> using hashmap
  // TC -> O(n)
  // SC -> O(n)
  // public int[] twoSum(int[] nums, int target) {
  //        HashMap<Integer, Integer> map = new HashMap<>() ;

  //        // run a loop ->
  //        for(int i=0; i<nums.length; i++) {
  //           int first = nums[i] ;
  //           int second = target - first ;

  //           if(map.containsKey(second)) {
  //               return new int[]{map.get(second), i} ;
  //           } else {
  //               map.put(nums[i], i) ;
  //           }
  //        }
  //        return new int[]{} ;
  //   }
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in) ;

      int[] nums = {2,7,11,15} ;

       int target = sc.nextInt() ;
     
     int[] ans = twoSum(nums, target) ;
     for(int t=0; t<ans.length; t++) {
      System.out.print(ans[t]+" ");
     }
   } 
}
       