public class PalindromeNumber {
    
    // Tc -> O(log10N + 1)
    // SC -> O(1)
     public int reverse(int n) {
        int revNum = 0 ;
        while(n != 0) {
            int digit = n % 10 ;
            
            if(revNum > (Integer.MAX_VALUE / 10) || revNum < (Integer.MIN_VALUE / 10)) {
              return 0 ;
            }
            revNum = (revNum * 10) + digit ;
            n = n / 10 ;
        }
        return revNum ;
    }
    public boolean isPalindrome(int n) {
        if(n < 0) {
            return false ;
        }
        int revNum = reverse(n) ;
         
        if(revNum == n) {
            return true ;
        }
        return false ;
    }
    public static void main(String[] args) {
        
    }
}
