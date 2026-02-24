public class LargestOddIntegerInString {
    
   // TC -> O(n)
   // SC -> O(1)
//    public static String largestOddNumber(String num) {
//          int n = num.length() ;
//          int idx = -1 ;

//          int i ;
//          for(i=n-1; i>=0; i--) { // we can ilitrate from right to left because if we right most odd number then whole number is odd number and if not then skip it.
//             if((num.charAt(i) - '0') % 2 == 1) { // we cast it to an integer and check it.
//                        idx = i ; 
//                        break ;                
//             }
//          }

//          // return empty if string if no odd digit was found
//          if(idx == -1) return "" ;

//         // skip leading zeros up to the odd digit
//         i = 0 ;
//         while(i < idx && num.charAt(i) == '0') i++ ;

//         // return substring from first non-zero to right most odd integer
//         return num.substring(i, idx + 1) ;
//     }

public static String largestOddNumber(String num) {
         int n = num.length() ;
         for(int i=n-1; i>=0; i--) { // we can ilitrate from right to left because if first number of right is odd then whole number is odd number and if not then skip it.
            if((int) num.charAt(i) % 2 != 0) { // we cast it to an integer and check it.
                return num.substring(0, i+1) ; // here i+1 because it is exclude last index in substring function.
            }
         }
         return "" ;
    }
    public static void main(String[] args) {
       String num = "4206" ;
       String ans = largestOddNumber(num) ;
       System.out.println(ans);
    }
}
