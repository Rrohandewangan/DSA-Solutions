import java.util.Arrays;

public class LongestCommonPrefix {
    
  public static String longestCommonPrefix(String[] strs) {
    if(strs.length == 0 || strs == null) {
         return "" ;
    } 
       String prefix = strs[0] ;
       
       for(int i=1; i<strs.length; i++) {
        // while loop running until strs[i] start with prefix
          while(!strs[i].startsWith(prefix)) {
            // to shrink the prefix from back side
            prefix = prefix.substring(0, prefix.length()-1) ;
            if(prefix.isEmpty()) {
                return "" ;
            }
          }
       }
       return prefix ;
  }


  // method 2 -> 
    
    // TC -> O(nlogn + m)
    // SC -> O(1)

    // public static String longestCommonPrefix(String[] s) {
    //         if(s == null || s.length == 0) return "";
    //     Arrays.sort(s) ; // sort array because we can't check all string of array so we can arrange them in lexicographically sroted order .
    //     // then we have only check first and last string of array
    //     int n = s.length ;
    //     int i=0; 
    //     while(i < s[0].length()) {
    //         if(s[0].charAt(i) == s[n-1].charAt(i)) { // 
    //                    i++ ;
    //         } else {
    //            break ;
    //         }
    //     }

    //  return s[0].substring(0, i) ;
    // }
    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"} ;
       System.out.println(longestCommonPrefix(strs));
    }
}
