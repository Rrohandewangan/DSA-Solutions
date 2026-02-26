public class BinarySearchSQRT {
    
    // TC -> O(logn)
    // SC -> o(1)
    
     static double sqrt(int n, int p) {
        int st = 0, end = n ;

        double root = 0.0 ;

        while(st <= end) {
            int mid = st + (end - st) / 2 ;

            if(mid * mid == n) {
                return mid ;
            } else if(mid * mid > n) {
                end = mid - 1 ;
            } else {
                st = mid + 1 ;
            }
        }
        
        double incr = 0.1 ;
        for(int i = 0; i < p; i++) {
            while(root * root <= n) {
                root += incr ;
            }

            root -= incr ;
            incr /= 10 ;
        }

        return root ;
    }     
    public static void main(String[] args) {
        int n = 40 ;
        int p = 3 ; // precision or decimal places

        System.out.printf("%.3f", sqrt(n ,p));
    }
}
