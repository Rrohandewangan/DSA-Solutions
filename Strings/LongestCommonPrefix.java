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
    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"} ;
       System.out.println(longestCommonPrefix(strs));
    }
}
