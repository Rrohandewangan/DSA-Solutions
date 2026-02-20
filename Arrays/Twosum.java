import java.util.* ;

public class Twosum {

  public static int[] twoSum(int[] nums, int target) {
    
    for(int i=0; i<nums.length-1; i++) {
      for(int j=i+1; j<nums.length; j++) {
        if(nums[i] + nums[j] == target) {
          return new int[]{i, j} ;
        } 
        
      }
    }
     return new int[]{} ;
  }
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
       