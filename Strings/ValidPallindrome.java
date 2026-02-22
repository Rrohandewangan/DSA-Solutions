public class ValidPallindrome {

    // Tc -> O(n)

     public static  boolean isAlphaNum(char ch) {
        return Character.isLetterOrDigit(ch) ; //check the character is alphanumeric or not it is built in function
    }

    public static boolean isPalindrome(String s) {
        int n = s.length() ;
        int st = 0, end = n - 1 ;
        // run a loop 
        while(st <= end) {
            if(!isAlphaNum(s.charAt(st))) {
                  st++; continue;
            }
            if(!isAlphaNum(s.charAt(end))) {
                end--; continue ;
            }

            if(Character.toLowerCase(s.charAt(st)) != Character.toLowerCase(s.charAt(end))) { // to convert into lowercase we built in fucntion also
                return false ; 
            }
            st++; end--;
        } 
        return true ;
    }
    public static void main(String[] args) {
      String s = "race a car" ;

      System.out.println(isPalindrome(s));

    }
}
