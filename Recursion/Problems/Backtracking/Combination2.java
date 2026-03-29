package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination2 {

    // TC -> O(2pow(n))
    // SC -> O(2pow(n))
    static void getAllCombinations(int[] arr, int target, int i, List<List<Integer>> ans, List<Integer> comb) {
         if(target == 0) {
            ans.add(new ArrayList<>(comb));
            return ;
        }

        if(i == arr.length || target < 0) {
            return ; 
        }

        comb.add(arr[i]);
        //inlcude 
        getAllCombinations(arr, target - arr[i], i + 1, ans, comb) ;

        // exclude
        comb.remove(comb.size() - 1);

        int idx = i + 1 ;
        while(idx < arr.length && arr[idx] == arr[idx - 1]) idx++ ;

        getAllCombinations(arr, target, idx, ans, comb) ;

    }
    

    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> comb = new ArrayList<>() ;
        getAllCombinations(arr, target, 0, ans, comb);
        return ans ;
    }
    
    public static void main(String[] args) {
        
    }
}
