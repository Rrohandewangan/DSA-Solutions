import java.util.ArrayList;
import java.util.List;

public class RearrangeArrEleBySign {

    // https://leetcode.com/problems/rearrange-array-elements-by-sign/description/


    // Brute Force approach ->

    // // TC -> O(n + n/2)
    // // SC -> O(n)
    // public int[] rearrangeArray(int[] nums) {
    //     int n = nums.length ;
    //     List<Integer> pos = new ArrayList<>() ;
    //     List<Integer> neg = new ArrayList<>() ;
        
    //     // step - 1 => seperate positives and negatives
    //     for(int i=0; i<n; i++) {
    //         if(nums[i] > 0) {
    //             pos.add(nums[i]) ; // add to positives
    //         } else {
    //             neg.add(nums[i]) ; // add to negatives
    //         }
    //     }
 
    //     // step 2 -> place positive at even index and negative at odd index
    //     for(int i=0; i<n/2; i++) {
    //        nums[2 * i] = pos.get(i) ; // even index -> positive
    //        nums[2 * i + 1] = neg.get(i) ; // odd index -> negative
    //     }
    //    return nums ;

    // }


    // Optimal Approach ->

      // TC -> O(n)
    // // SC -> O(n)
    // public int[] rearrangeArray(int[] nums) {
    //     int n = nums.length ;
    //     int[] ans = new int[n] ;
    //     int posIdx = 0, negIdx = 1 ;  // to track the postive and negative index
    //     for(int i=0; i<n; i++) {
    //         if(nums[i] > 0) {
    //             ans[posIdx] = nums[i] ;
    //             posIdx += 2 ; // 1st pos ele is 0th -> 2nd -> 4th
    //         } else {
    //             ans[negIdx] = nums[i] ; // 1st neg ele is 1st -> 3rd -> 5th
    //             negIdx += 2 ;
    //         }
    //     }
    //    return ans ;
    // }

    // Variety - 2 -> if number of positve and negative ele is not euqal so we can add remaining ele in last of array

    // TC -> O(N) + O(minof(pos, neg)) + O(remaining) => O(N)
    // SC -> O(N)


    public int[] rearrange(int[] nums) {
        int n = nums.length ;
        List<Integer> pos = new ArrayList<>() ;
        List<Integer> neg = new ArrayList<>() ;


        for(int i=0; i < n; i++) {
            if(nums[i] > 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]) ;
            }
        }

        if(pos.size() > neg.size()) {
            for(int i=0; i<neg.size(); i++) {
                nums[2 * i] = pos.get(i) ;
                nums[2 * i + 1] = neg.get(i) ;
            }

            int idx = neg.size() * 2 ;
            for(int i=neg.size(); i<pos.size(); i++) {
                nums[idx] = pos.get(i);
                idx++ ;
            }
        } else {
            
             for(int i=0; i<pos.size(); i++) {
                nums[2 * i] = pos.get(i) ;
                nums[2 * i + 1] = neg.get(i) ;
            }

            int idx = pos.size() * 2 ;
            for(int i=pos.size(); i<neg.size(); i++) {
                nums[idx] = pos.get(i);
                idx++ ;
            }
        }

      return nums ;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 2, 3, 4 ,-3 , 1} ;


    }
}
