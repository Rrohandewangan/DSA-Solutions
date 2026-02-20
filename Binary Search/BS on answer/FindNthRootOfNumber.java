public class FindNthRootOfNumber {

    
    // // TC -> O(logn)
    // public static int findVal(int mid, int n, int m) {
    //     int ans = 1 ;
    //     for(int i=1; i<=n; i++) {
    //         ans *= mid ;
    //         if(ans > m) {
    //             return 2 ;
    //         }
    //     }
    //     if(ans == m) {
    //         return 1 ;
    //     } else {
    //         return 0 ;
    //     }


    // }
    // public static int findNthRoot(int n, int m) {
    //    int st = 1, end = m ;
    //    while(st <= end) {
    //     int mid = st+(end-st) / 2 ;
    //     int val = findVal(mid, n, m) ; 
        
    //     if(val == 1) {
    //         return mid ;
    //     } else if(val == 0) {
    //         st = mid+1 ;
    //     } else {
    //         end = mid-1 ;
    //     }
    //    }
    //    return -1 ;
    // }


    // TC -> O(n) By Linear Search
    // public static int findNthRoot(int n, int m) {
    //     int x = -1 ;
    //     int newNum = -1 ;
    //     for(int i=1; i<=m; i++) {
    //        newNum = (int) Math.pow(i, n) ;

    //        if(newNum == m) {
    //         return i ;
    //        } 
    //        else if(newNum > m) {
    //         break ;
    //        }
    //     }
    //     return -1 ;
    // }

         
    // 2nd time solve
    // brute force ->
    // TC -> O(m * logn with base 2)
    // SC -> O(1)


    //  public static int findNthRoot(int n, int m) {
    //     long num = 0 ;
    //     for(int i=1; i <= m; i++) {
    //          num = Math.pow(i, n) ;
    //          if(num == m) {
    //              return i ;
    //          } else if(num > m) {
    //              break;
    //          }
    //     }
    //     return -1 ;
    //  } 

    
    // Optimal approach ->
    // Binary search ->
    // TC -> O(logn * m)
    // Sc -> O(1)
   
      // return 1 if == m
      // return 0 if < m
      // return 2 if > m
        static int func(int mid, int n, int m) {
            long ans = 1 ;
            for(int i=1; i<=n; i++) {
                ans = ans * mid ;
                if(ans > m) return 2 ;
            }
             if(ans == m) {
                return 1 ;
             } else {
                return 0 ;
             }
        }
        static int findNthRoot(int n, int m) {
            int st = 1, end = m ;
            while(st <= end) {
                int mid = st + (end - st)/2 ;
                int num = func(mid, n, m) ;

                if(num == 1) {
                    return mid ;
                } else if(num == 0) {
                    st = mid + 1 ;
                } else {
                    end = mid - 1 ;
                }
            }

            return -1 ;
        }
   
    public static void main(String[] args) {
        int n = 3 ;
        int m = 27 ;
        long ans = findNthRoot(n, m) ;
        System.out.println(ans);

    }
}
