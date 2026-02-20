public class KthMissingPositiveNumber {
    
    // TC -> O(N) 
    //  public static  int findKthPositive(int[] arr, int k) {
    //     int n = arr.length ;
    //     for(int i=0; i<n; i++) {
    //         if(arr[i] <= k) {
    //             k++ ;
    //         } else {
    //             break ;
    //         }
    //     }
    //     return k ;
    // }

    // TC -> O(log(n))
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length ;
        int st=0, end=n-1 ;

        while(st <= end) {
           int mid = st+(end-st)/2 ;
           // This is formula to missing num in ith index
           int missing = arr[mid] - (mid+1) ;
           if(missing <= k) {
            st = mid+1 ;
           } else {
            end = mid-1 ;
           }
        }
        return st + k ;
    }

    public static void main(String[] args) {
       int[] arr = {2,3,4,7,11} ;
       int k = 5 ;
       System.out.println(findKthPositive(arr, k));
    }
}
