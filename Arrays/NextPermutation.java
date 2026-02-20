import java.util.* ;
public class NextPermutation {
    //https://leetcode.com/problems/next-permutation/description/
    // TC -> O(n)
    // SC -> O(1)
    public static void nextPermutation(int[] nums) {
        int n = nums.length ;
        int piv = -1 ;
        for(int i=n-2; i>=0; i--) {
          if(nums[i] < nums[i+1]) {
            piv = i ;
            break ;
          }
        }
        if(piv == -1) {
         Arrays.sort(nums) ;
         return ;
        }

        for(int i=n-1; i>piv; i--) {
            if(nums[i] > nums[piv]) {
                int temp = nums[i] ;
                nums[i] = nums[piv] ;
                nums[piv] = temp ;
                break ;
            }
        }
        int i = piv+1, j = n-1 ;
        while (i <= j) {
          int temp = nums[i] ;
          nums[i] = nums[j] ;
          nums[j] = temp ;
            i++ ; j-- ;
        }
        
        for(int k=0; k<n; k++) {
         System.out.print(nums[k]+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3} ;
        nextPermutation(nums);
    }
}
