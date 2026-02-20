//https://leetcode.com/problems/powx-n/

// Imp points->
// 1. If number n -> log2(n)+1 digits in number 
// 2. we can run loop in binary form of given power(n)
// 3. we can calculate mutliply 3pow1 * 3pow1 = 3pow2 // so steps is reduced to logn(half).
// 4. if power(n) is negetive then do x -> 1/x .


public class xPown {

    // binary exponentition // 
    // time complexity -> O(logn)
    public static double xPown(int n, int x) {
       if(n == 0) return 1.0 ;
       if(x == 0) return 0.0 ;
       if(x == 1) return 1.0 ;
        if(x == -1 && n % 2 == 0) return 1.0 ;
        if(x == -1 && n % 2 != 0) return -1.0 ;

        long binForm = n ;
        if(n < 0) {
            x = 1/x ;
            binForm = -binForm ;
        }
        double ans = 1 ;
        while (binForm > 0) {
            if(binForm % 2 == 1) {
                ans *= x ;
            }
            x *= x ;
            binForm /= 2 ;
            
        }
        return ans ;
    }
      public static void main(String[] args) {
         int x = 3 ;
         int n = 3 ;
         System.out.println(xPown(n, x));
      }
}
