public class SingleElementInSortedArray {
    

    // TC -> O(n)
    // public static int singleElement(int[] arr) {
    //     int n = arr.length ;
    //     int ans = -1 ;
    //     for(int i=1; i<n; i++) {
    //       if(arr[i-1] != arr[i] && arr[i] != arr[i+1] ) {
    //          ans = arr[i] ;
    //       }
    //     }
    //     return ans ;
    // }

    // TC -> O(logn)
    public static int singleElement(int[] arr) {
        int n = arr.length ;
        int st = 0 ;
        int end = n-1 ;
        if(n == 1) {
            return arr[0] ;
        }
        while(st <= end) {
         int mid = st + (end-st) / 2 ;

         if(mid == 0 && arr[mid] != arr[mid+1]) {
            return arr[mid] ;
         }
         if(mid == n-1 && arr[mid-1] != arr[mid]) {
             return arr[mid] ;
         }
         
         if(arr[mid-1] != arr[mid] && arr[mid] != arr[mid+1]) {
            return mid ;
         }

         if(mid % 2 == 0) {
            if(arr[mid-1] == arr[mid]) { // left
                end = mid-1 ;
            } else {   // right
                st = mid+1 ;
            }
         } else {
            if(arr[mid-1] == arr[mid]){  // right
               st = mid+1 ;
            } else { // left
                end = mid-1 ;
            }
         }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8} ;
        int ans = singleElement(nums) ;
        System.out.println(ans);
    } 
}
