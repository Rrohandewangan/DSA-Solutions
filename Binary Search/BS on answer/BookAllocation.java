public class BookAllocation {

    // to check given input is vaild or not
    // public static boolean isValid(int[] arr, int n, int m, int maxAllowedPages) { // O(n)
    //     int stu = 1, pages = 0 ;
    //     for(int i=0; i<n; i++) {
    //         if(arr[i] > maxAllowedPages) {
    //             return false ;
    //         }

    //         if(pages+arr[i] <= maxAllowedPages) {
    //             pages += arr[i] ;
    //         } else {
    //              stu++ ;
    //              pages += arr[i] ;
    //         }
    //     }
    //     if(stu > m) {
    //         return false ;
    //     } else {
    //         return true ;
    //     }
    // }
   
    // TC -> O(range * n) 
    // public static int allocateBooks(int[] arr, int n, int m) {
         // if(m > n) {
         // return -1 ;
         // }
    //     int max = 0 ;
    //     for(int i=0; i<n; i++) {   // O(n)
    //         max += arr[i] ;
    //     }

    //     for(int i=0; i<=max; i++) {   //range of possible ans
    //         if(isValid(arr, n, m, i)) {
    //             return i ;
    //         }
    //     }
    //     return -1 ;
    // }

    // TC -> O(log(range) * n)
    // public static int allocateBooks(int[] arr, int n, int m) {
    //     if(m > n) { // Book allocation not possible
    //         return -1 ;
    //     }
    //     int max = 0 ;
    //     for(int i=0; i<n; i++) { // O(n)
    //         max += arr[i] ;
    //     }
        
    //     int st=0, end=max, ans = -1 ;
    //     while(st <= end) {  // O(log(range of possible ans) * n)
    //         int mid = st+(end-st)/2 ;
    //         if(isValid(arr, n, m, mid)) {
    //             ans = mid ;
    //             end = mid-1 ; // discard right side 
    //         } else {
    //             st = mid+1 ; // discard left side 
    //         }
    //     }
    //      return ans ;
    // }



    // 2nd time solve 
        // TC -> O(n) + O(logN * n)
        // SC -> O(1)
    public static boolean isValid(int[] arr, int n, int m, int maxAllowedPages) {
       int stu = 1, pages = 0 ;

       for(int i=0; i<n; i++) { // o(n)

        if(arr[i] > maxAllowedPages) {
            return false ;
        }
        if(arr[i] + pages <= maxAllowedPages) {
            pages += arr[i] ;
        } else {
            stu++ ;
            pages = arr[i] ;
        }
       }

       return stu > m ? false : true ;
    }



    public static int allocateBooks(int[] arr, int n, int m) {
        if(m > n) { 
            return -1 ;
        }
        // to find end value of answer range 
        int sum = 0 ; 
        for(int i=0; i<n; i++) {  // O(n)
            sum += arr[i] ;
        }

        int st = 0, end = sum ;
        int ans = -1 ; // to store answer

        while(st <= end) {  //O(logN * n) // range = N
            int mid = st + (end - st)/2 ;

            if(isValid(arr, n, m, mid)) { // if condition is true then go left and minimum answer
                ans = mid ;
                end = mid - 1 ;
            } else { // go right and find
                st = mid  + 1 ;
            }
        }

        return ans ;
    }

    public static void main(String[] args) {
        int[] arr = {15, 17, 20} ;
        int n = 3  ;
        int m = 2;

        System.out.println(allocateBooks(arr, n, m));
    }
}
