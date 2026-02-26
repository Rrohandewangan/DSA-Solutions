public class DigitsInNumber {

    // for call operations sum , print , number of digits in n
    // TC -> O(log10(n) + 1 or log(n) with base 10 + 1)
    // SC -> O(1)

    public static void printDigits(int n) {
        int rev = 0 ;
        while(n > 0) {
            int digit = n % 10 ;
            
            rev = 
            n = n / 10 ;
        }

        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 3653 ;
        printDigits(n);
    }
}
