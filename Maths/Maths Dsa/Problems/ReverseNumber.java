public class ReverseNumber {
    // TC ->  O(log₁₀N);
    // SC => O(1)
   public static int reverse(int n) {
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
    public static void main(String[] args) {
        
        System.out.println(reverse(3454));
    }
}
