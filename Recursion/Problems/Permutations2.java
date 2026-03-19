import java.util.ArrayList;
import java.util.List;

public class Permutations2 {
    
    // TC -> O(n! * n)
    // SC -> O(n! * n)
    static void getPerms(int[] nums, int idx, List<List<Integer>> ans) {
         if(idx == nums.length) {
            ArrayList<Integer> curr = new ArrayList<>() ;
            for(int num : nums) {
                curr.add(num) ;
            }
            ans.add(curr) ;
            return ;
         }

         for(int i=idx; i<nums.length; i++) {
            //swap => idx place => ith element choice
            int temp = nums[idx] ;
            nums[idx] = nums[i] ;
            nums[i] = temp ;
            getPerms(nums, idx+1, ans) ;

            //backtracking step
            temp = nums[idx] ;
            nums[idx] = nums[i] ;
            nums[i] = temp ;
         }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ;
        getPerms(nums, 0, ans) ;
        return ans ;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3} ;
        List<List<Integer>> list = permute(nums) ;
        System.out.println(list);
    }
}
