import java.util.Arrays;
import java.util.HashMap;

public class HowManyNumSmallerThen {
    
    // brute force approach -> 
    // Tc -> O(n2)
    // SC -> o(n)
    // public int[] smallerNumbersThanCurrent(int[] nums) {
    //     int n = nums.length ;
    //     int[] ans = new int[n] ;

    //     for(int i=0; i<n; i++) {
    //         int count = 0 ;
    //         for(int j=0; j<n; j++) {
    //             if(nums[j] < nums[i]) {
    //                 count++;
    //             }
    //         }
    //         ans[i] = count ;
    //     }
    //     return ans ;
    // }


    // Better approach -> 
    // TC -> O(n logn)
    // SC -> O(n)
    // public int[] smallerNumbersThanCurrent(int[] nums) {
    //     int n = nums.length ;
    //     int[] ans = new int[n] ;
    //     int[] sorted = nums.clone() ;
    //     Arrays.sort(sorted) ;

    //     HashMap<Integer, Integer> map = new HashMap<>() ;

    //     for(int i=0; i<n; i++) {
    //         if(!map.containsKey(sorted[i])) {
    //             map.put(sorted[i], i) ;
    //         }
    //     }

    //     for(int i=0; i<n; i++) {
    //         ans[i] = map.get(nums[i]) ;
    //     }
    //     return ans ;
    // }


    // optimal approach ->
     // TC -> O(n)
    // SC -> O(1)
    // public int[] smallerNumbersThanCurrent(int[] nums) {
    //     int n = nums.length ;
    //     int[] ans = new int[n] ;
    //     int[] freq = new int[101] ;

    //     // store freq of number present in array
    //     for(int num : nums) {
    //         freq[num]++ ;
    //     }

    //     // convert freq of number to prefix sum or how many number before 
    //     for(int i=1; i<101; i++) {
    //         freq[i] = freq[i] + freq[i-1] ;
    //     }

    //     for(int i=0; i<n; i++) {
    //         if(nums[i] == 0) {
    //             ans[i] = 0 ;
    //         } else {
    //             ans[i] = freq[nums[i] - 1] ;
    //         }
           
    //     }
    //     return ans ;
    // }
    public static void main(String[] args) {
        
    }
}
