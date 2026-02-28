public class FindMax1 {
    
    // brute force approach -> 
    // TC -> O(n * m)
    // SC -> O(1)
    // static int findMaxOnes(int[][] mat, int n, int m) {
    //     int maxCount = 0 ; // to store maxcount of 1's
    //     int maxIdx = -1 ; // to store maxIdx of 1's

    //     for(int row=0; row<n; row++) {
    //         int count = 0 ;
    //         for(int col=0; col<m; col++) {
    //             count += mat[row][col] ;
    //         }

    //         if(count > maxCount) {
    //             maxCount = count ;
    //             maxIdx = row ;
    //         }
    //     }
    //     return maxIdx ;
    // }

    // optimal approach -> 

    // TC -> O(n * logm)
    // SC -> O(1)

    public static int lowerBound(int[] arr, int N, int x) {
        int st = 0, end = N-1, ans = -1;
        while(st <= end) {
          int mid = st+(end-st) / 2 ;
          if(arr[mid] >= x ) {
            ans = mid ;
            end = mid-1 ;
           } else {
           st = mid+1 ;
          }
        }
        return ans ;
    }


     static int findMaxOnes(int[][] mat, int n, int m) {
        int maxCount = 0 ; // to store maxcount of 1's
        int maxIdx = -1 ; // to store maxIdx of 1's

        for(int row=0; row<n; row++) {
            int count = m - lowerBound(mat[row], m, 1) ;
            
            if(count > maxCount) {
                maxCount = count ;
                maxIdx = row ;
            }
        }
        return maxIdx ;
    }
    public static void main(String[] args) {
        int[][] mat = {{0, 0}, {0, 0}} ;
        int n = mat.length ;
        int m = mat[0].length ;

        System.out.println(findMaxOnes(mat, n, m));
    }

}
