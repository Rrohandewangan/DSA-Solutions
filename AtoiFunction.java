public class AtoiFunction {

    // TC -> o(n)
    // SC -> O(n)
     static int helper(String s, int i, long num, int sign) {
        if(i >= s.length() || !Character.isDigit(s.charAt(i))) {
            return (int)(sign * num) ;
        }

        num = num * 10 + (s.charAt(i) - '0') ;

        if(sign * num >= Integer.MAX_VALUE) return Integer.MAX_VALUE ;
        if(sign * num <= Integer.MIN_VALUE) return Integer.MIN_VALUE ;


        return helper(s, i+1, num, sign) ;
    }

    public int myAtoi(String s) {
        int i = 0 ;
        
        // check for leading space in string
        while(i < s.length() && (s.charAt(i) == ' ')) i++ ;

        // check for next number sign is + or -
        int sign = 1 ;
        if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1 ;
            i++ ;
        }

        return helper(s, i, 0, sign) ;
    }

    public static void main(String[] args) {
        
    }
}