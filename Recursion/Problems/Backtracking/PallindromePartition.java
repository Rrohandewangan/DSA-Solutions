package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PallindromePartition {
    
    // TC -> O(n * 2pow(n))
    // SC -> O(n * 2pow(n))
    static boolean isPalin(String s) {
        int left = 0, right = s.length() - 1;
        
        while(left < right) {
           if(s.charAt(left) != s.charAt(right)) {
             return false ;
           }
           left++; right--;
        }
        return true ;
    }

    static void getAllParts(String s, List<String> curr, List<List<String>> ans) {
        if(s.length() == 0) {
            ans.add(new ArrayList<>(curr)) ;
            return ;
        }

        for(int i=0; i<s.length(); i++) {
            String part = s.substring(0, i+1);

            if(isPalin(part)) {
                curr.add(part);
                getAllParts(s.substring(i+1), curr, ans);
                curr.remove(curr.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>() ;
        List<String> curr = new ArrayList<>() ;
        getAllParts(s, curr, ans) ;
        return ans ;

    }
    public static void main(String[] args) {
        
    }
}
