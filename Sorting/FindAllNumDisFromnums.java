
import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-Array/

public class FindAllNumDisFromnums {
    
    // TC -> O(n)
    // SC -> O(1)
      public  List<Integer> findDisappearedNumbers(int[] nums) {

          int n = nums.length ;
          int i=0;
        while(i < nums.length) {
            int correctIdx = nums[i] - 1 ;
            if(nums[i] != nums[correctIdx]) {
                swap(nums, i, correctIdx) ;
            } else {
                i++ ; 
            }
        }

        // search for missing numbers in numsay 
        List<Integer> ans = new ArrayList<>() ;
            
        for(int idx=0; idx<n; idx++) {
            if(idx + 1 != nums[i]) {
                ans.add(idx + 1) ;
            }
        }
        return ans ;
    }
 
    public static void swap(int[] nums, int first, int second) {
            int temp = nums[first] ;
            nums[first] = nums[second] ;
            nums[second] = temp ;
    }
    
    public static void main(String[] args) {

        System.out.println();
    }
}
