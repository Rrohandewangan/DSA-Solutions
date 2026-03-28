public class PowOfFour {
    
    // TC -> O(log4(n))
    // SC -> O(log4(n))
    public boolean isPowerOfFour(int n) {
        if(n == 1) {
            return true ;
        }
        if(n <= 0) {
            return false ;
        }
        if(n % 4 != 0) {
            return false ;
        }

        return isPowerOfFour(n / 4) ;
    }
    
    public static void main(String[] args) {
        
    }
}
