public class removeOccurrences {
  
    // TC -> O(n * m) 
    // SC -> O(n)
    public static  String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s) ;

        while(sb.length() > 0 && sb.indexOf(part) != -1) { // run till vaild first occurence is found //
            int startIdx = sb.indexOf(part) ; // find first index of part substring 
            sb.delete(startIdx, startIdx + part.length()) ; // delete the 
        }

        return sb.toString() ;
    }

       public static void main(String[] args) {
       String s = "daabcbaabcbc" ;
       String part = "abc" ;
      System.out.println(removeOccurrences(s, part));
    }
}
