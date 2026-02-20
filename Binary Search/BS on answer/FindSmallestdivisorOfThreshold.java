public class FindSmallestdivisorOfThreshold {

// TC -> O(nums[max]*N)

//     public static int divisorSum(int[] nums, int div) {
//         int n = nums.length ;
//         int sum = 0 ;
//         for(int i=0; i<n; i++) {
//             sum += (int)Math.ceil((double)nums[i]/(double)div) ;
//         }
//         return sum ;
//     }
    
//     public static int smallestDivisor(int[] nums, int threshold) {
//         int n = nums.length ;
//         int max = Integer.MIN_VALUE ;
//         for(int i=0; i<n; i++) {
//             max = Math.max(max, nums[i]) ;
//         }
        
//         for(int i=1; i<=max; i++) {
//         int divSum = divisorSum(nums, i) ;

//         if(divSum <= threshold) {
//             return i ;
//         }
//     }
//     return -1 ;
//   }


// TC -> O(log(nums[max]*N))
public static int divisorSum(int[] nums, int div) {
        int n = nums.length ;
        int sum = 0 ;
        for(int i=0; i<n; i++) {
            sum += (int)Math.ceil((double)nums[i]/(double)div) ;
        }
        return sum ;
    }

 public static int smallestDivisor(int[] nums, int threshold) {
     int n = nums.length ;
     int max = Integer.MIN_VALUE ;
     int ans = -1 ;
     for(int i=0; i<n; i++) {
        max = Math.max(max, nums[i]) ;
     }

     int st=1, end=max ;
     while(st <= end) {
        int mid = st+(end-st)/2 ;
        int divSum = divisorSum(nums, mid) ;

        if(divSum <= threshold) {
           ans = mid ;
           end = mid-1 ;
        } else {
            st = mid+1 ;
        }
     }

     return ans ;

 }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5} ;
        int threshold = 8 ;
        System.out.println(smallestDivisor(nums, threshold));
    }
}
