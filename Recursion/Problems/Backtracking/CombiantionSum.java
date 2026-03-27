package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombiantionSum {
    
    // TC -> O(npow(target/min(candidates))
    // SC -> O(npow(target/min(candidates))

    static void getAllCombinations(int[] arr, int target, int idx, List<Integer> comb, List<List<Integer>> ans) {
        if(idx == arr.length || target < 0) {
            return ;
        }
        if(target == 0) {
            ans.add(new ArrayList<>(comb)) ;
            return ;
        }

        comb.add(arr[idx]);
        //single
        // getAllCombinations(arr, target - arr[idx], idx + 1, comb, ans);
        //multiple
        getAllCombinations(arr, target - arr[idx], idx, comb, ans);

        // exclusion or backtracking
        comb.remove(comb.size() - 1);
        getAllCombinations(arr, target, idx + 1, comb, ans);

    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> comb = new ArrayList<>() ;
        getAllCombinations(arr, target, 0, comb, ans) ;
        return ans ;
    }
    public static void main(String[] args) {
        
    }
}
