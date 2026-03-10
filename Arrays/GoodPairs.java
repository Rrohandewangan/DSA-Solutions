import java.util.HashMap;

public class GoodPairs {
    
    //Brute force approach  -> 
    // TC -> O(n2)
    // SC -> O(1)
    //  public int numIdenticalPairs(int[] nums) {
    //     int n = nums.length ;
    //     int count = 0; 
    //     for(int i=0; i<n; i++) {
    //         for(int j=i+1; j<n; j++) {
    //             if(nums[i] == nums[j] && i < j) {
    //                 count++ ;
    //             }
    //         }
    //     }
    //     return count ;
    //  }

    // better approach -> 
    // TC -> O(n)
    // SC -> O(n)
    // public int numIdenticalPairs(int[] nums) {
    //     int n = nums.length ;
    //     int count = 0; 
    //     HashMap<Integer, Integer> map = new HashMap<>();
       
    //     for(int num : nums) {
    //         int freq = map.getOrDefault(num, 0) ;
    //         count += freq ;
    //         map.put(num, freq + 1) ;
    //     }

    //     return count ;
    // }
 

    // optimal approach -> 
    // TC -> O(n)
    // SC -> O(1)
    // public int numIdenticalPairs(int[] nums) {
    //     int n = nums.length ;
    //     int count = 0; 
    //     int[] freq = new int[101] ;
       
    //     for(int num : nums) {
    //        count += freq[num] ;
    //        freq[num]++ ; 
    //     }
    //     return count ;
    // }
    public static void main(String[] args) {
        
    }
}
