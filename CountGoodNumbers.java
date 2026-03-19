public class CountGoodNumbers {
    
    // brute force approach ->
    // recursive approach ->
    // Tc -> O(2pow(n))
    // SC -> O(n)
    public int countGoodNumbers(long n) {
        return helper(0, n) ;
    }

    static final int mod = 1_000_000_007 ;

    public int helper(int index, long n) {
         if(index == n) {
            return 1 ;
         }

         long ans = 0 ;

         if(index % 2 == 0) {
            for(int i=0; i<5; i++) {
                ans = (ans + helper(index + 1, n)) % mod ;
            }
         } else {
            for(int i=0; i<4; i++) {
                ans = (ans + helper(index + 1, n)) % mod ;
            }
         }

         return (int)ans ;
    }
    public static void main(String[] args) {
        
    }
}