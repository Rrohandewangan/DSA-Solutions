public class FindingSqrtofNusingBS {
    
    // TC -> O(n)
    // public static int findingSqrtOfn(int n) {
    //      int ans = -1 ;
    //     for(long i=1; i<=n; i++) {
    //       long  x = i*i ;
    //        if(x <= (long)n) {
    //         ans = (int) i ;
    //        } else {
    //          break ;
    //        }
    //     }
    //     return ans ;
    // }


    // Using BinarySearch TC -> O(logn)
    // public static int findingSqrtOfn(int n) {
    //     int ans = -1 ;
    //     int st=1, end=n ; 
    //     while(st <= end) {
    //       long mid = st+(end-st)/2 ;
    //       long x = mid*mid ;   
    //       if(x <= (long) n) {
    //         ans = (int) mid ;
    //         st = (int) mid+1 ;
    //       } else {
    //         end = (int) mid-1 ;
    //       }   
    //     }
    //     return ans ;
    // }
    
    // Using in-built sqrt() function TC -> O(logn)
    // public static int findingSqrtOfn(int n) {
    //     int ans = (int) Math.sqrt(n) ;
    //     return ans ;
    // }

    // 2nd method ->
    // Linear Search
    // TC - O(sqrtrootof(N))
    // SC - O(1)
    // public static int findingSqrtOfn(int N) {
    //   int ans = -1 ;
    //   for(int i=1; (long)i*i <= N; i++) { // check sqrt root N and also return its floor value .
    //       ans = i ;
    //   }
    //   return ans ;
    // }


    // Binary Search

    public static int findingSqrtOfNusingBs(int N) {
      int ans = -1 ;
      int st = 1, end = N ;

      while(st <= end) {
        long mid = st + (end - st)/ 2;

        if((long)mid * mid > (long)N) {
          end = (int)mid - 1 ;
        } else {
          ans = (int)mid ;
          st = (int)mid + 1 ;
        }
      }
      return ans ;
    }

    public static void main(String[] args) {
        int N = 50 ;
        System.out.println(findingSqrtOfNusingBs(N));

    }
}
