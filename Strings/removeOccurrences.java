public class removeOccurrences {
  
    public static String removeOccurrences(String s, String part) {
       StringBuilder sb = new StringBuilder(s) ;
       
       while(sb.length() > 0 && sb.indexOf(part) != -1) {
         int index = sb.indexOf(part) ;
         sb.delete(index, index+part.length()) ;
       }
       return sb.toString() ;
    }
    public static void main(String[] args) {
       String s = "daabcbaabcbc" ;
       String part = "abc" ;
      System.out.println(removeOccurrences(s, part));
    }
}
