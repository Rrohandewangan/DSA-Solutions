import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
    
    // TC -> O(nlon(n) * 2pow(n) * n)
    // SC -> O(n 8 2pow(n) * n)
    static void getAllSubsets(int[] nums, ArrayList<Integer> curr, int i, List<List<Integer>> result) {
        if(i == nums.length) {
            result.add(new ArrayList(curr)) ;
            return ;
        }

        // include 
        curr.add(nums[i]) ;
        getAllSubsets(nums, curr, i+1, result) ;

        curr.remove(curr.size() - 1) ;

        int idx = i + 1 ;
        while(idx < nums.length && nums[idx] == nums[idx - 1]) idx++ ;
        
        //exclude
        getAllSubsets(nums, curr, idx, result) ;
    }


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums) ;
        List<List<Integer>> result = new ArrayList<>() ;
        getAllSubsets(nums, new ArrayList<>(), 0, result) ;
      
        return result ;

    }
    public static void main(String[] args) {
        
    }
}
