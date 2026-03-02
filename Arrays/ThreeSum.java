import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {


    //optimal approach -> 
    // TC -> O(n2 + nlogn)
    // SC ->O(1)
    // public List<List<Integer>> threeSum(int[] nums) {
    //     int n = nums.length ;
    //     List<List<Integer>> ans = new ArrayList<>() ;
    //     Arrays.sort(nums) ;

    //     for(int i=0; i<n; i++) {
    //         if(i > 0 && nums[i] == nums[i-1]) continue ;
    //         int j = i+1, k = n-1 ;

    //         while(j < k) {
    //             int sum = nums[i] + nums[j] + nums[k] ;
    //             if(sum < 0) {
    //                 j++ ;
    //             }else if(sum > 0) {
    //                 k-- ;
    //             }else {
    //                 ans.add(Arrays.asList(nums[i], nums[j], nums[k])) ;
    //                 j++; k-- ;

    //                 while(j < k && nums[j] == nums[j-1]) j++ ;
    //             }
    //         }
    //     }
    //     return ans ;
    // }

    //  //better approach -> 
    // // TC -> O(n2)
    // // SC ->O(n2)
    // public List<List<Integer>> threeSum(int[] nums) {
    //     int n = nums.length ;
    //     Set<List<Integer>> ans = new HashSet<>() ;
    //     List<Integer> triplet = new ArrayList<>() ;

    //     for(int i=0; i<n; i++) {
    //         int tar = -nums[i] ;
    //         Set<Integer> seen = new HashSet<>() ;
    //         for(int j=i+1; j<n; j++) {
    //             int third = tar - nums[j] ;

    //             if(seen.contains(third)) {
    //                 triplet = Arrays.asList(nums[i], nums[j], third) ;
    //                 Collections.sort(triplet) ;
    //                 ans.add(triplet) ;
    //             }
    //             seen.add(nums[j]) ;
    //         }
    //     }
    //     return new ArrayList<>(ans) ;
    // }

    
    //  // brute force approach -> 
    // // TC -> O(n3)
    // // SC ->O(n2)
    // public List<List<Integer>> threeSum(int[] nums) {
    //     int n = nums.length ;
    //     Set<List<Integer>> set = new HashSet<>() ;
    //     List<Integer> temp = new ArrayList<>() ;
    //     for(int i=0; i<n; i++) {
    //         for(int j=i+1; j<n; j++) {
    //             for(int k=j+1; k<n; k++) {
    //                 if(nums[i] + nums[j] + nums[k] == 0) {
    //                    temp = Arrays.asList(nums[i], nums[j], nums[k]) ;
    //                    Collections.sort(temp) ;
    //                    set.add(temp) ;
    //                 }
    //             }
    //         }
    //     }
    //     return new ArrayList<>(set) ;
    // }

    
    public static void main(String[] args) {
        
    }
}
