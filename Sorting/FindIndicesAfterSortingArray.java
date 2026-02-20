import java.util.ArrayList;
import java.util.List;
import java.util.* ;

public class FindIndicesAfterSortingArray {

    // TC -> O(n)
    // SC -> O(1)

    public static List<Integer> targetIndices(int[] nums, int target) {
          int n = nums.length ;
          int less = 0, tCount = 0 ;

          for(int val : nums) {
            if(target == val) {
                tCount++ ;
            } else if(val < target) {
                less++ ;
            }
          }

          // add indices where target apprear in array after sorting  
          ArrayList<Integer> ans = new ArrayList<>() ;

          for(int i=0; i<tCount; i++) {
            ans.add(less + i) ;
          }
        return ans ;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3} ;
        int target = 2 ;

        List<Integer> ans = targetIndices(nums, target) ;

        System.out.println(ans);

        
    }

}
