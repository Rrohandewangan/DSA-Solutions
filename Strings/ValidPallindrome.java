public class ValidPallindrome {


    // Tc -> O(n)

    public static boolean isAlphaNum(char ch) {
    //   if(Character.toLowerCase(ch) >= '0' && Character.toLowerCase(ch) <= '9' || Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z' ) {
    //       return true ;
    //   } else {
    //     return false ;
    //   }
    return Character.isLetterOrDigit(ch) ;
    }
    
    public static boolean isPallindrome(String s) {
         int n = s.length() ;
         int st = 0, end = n-1 ;

         while(st <= end) {
            if(!isAlphaNum(s.charAt(st))) {
                st++; continue ;
            }
            if(!isAlphaNum(s.charAt(end))) {
                end--; continue ;
            }

            if(Character.toLowerCase(st) != Character.toLowerCase(end)) {
               return false ;
            }
         }
         return true ;

    }
    public static void main(String[] args) {
      String s = "race a car" ;

      System.out.println(isPallindrome(s));

    }
}
