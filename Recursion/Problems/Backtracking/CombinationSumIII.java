package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    

     // Tc -> O(C(9,K) * k)
    // SC -> O(C(9, k) * k)
    static void getAllCombinations(int k, int n, int st, List<List<Integer>> ans, List<Integer> comb) {
       if(k == 0) {
        if(n == 0) {
            ans.add(new ArrayList<>(comb));
        }
        return ;
       }

       if(n < 0) {
        return ;
       }

        for(int i=st; i<=9; i++) {
            if(i > n) {
                break ;
            }
            // include 
            comb.add(i) ;
            getAllCombinations(k - 1, n - i, i + 1, ans, comb) ;
            //exclude 
            comb.remove(comb.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> comb = new ArrayList<>() ;

        getAllCombinations(k, n, 1, ans, comb) ;
        return ans ;


    }
    public static void main(String[] args) {
        
    }
}
