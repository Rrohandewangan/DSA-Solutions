public class RotateWordInString {
    
     public static String reverseWords(String s) { 
      int n = s.length() ;
      StringBuilder sb = new StringBuilder(s) ;
      String ans = "" ;

      sb.reverse() ;

      for(int i=0; i<n; i++) {
        StringBuilder word = new StringBuilder("") ;
        while(i < n && sb.charAt(i) != ' ') {
              word.append(sb.charAt(i)) ;
              i++ ;
        }

         word.reverse() ;
        if(word.length() > 0) {
           ans += " "+ word ;
        }
      }
        return ans.substring(1) ;
     }

    public static void main(String[] args) {
      String s = "the sky is blue" ;
      System.out.println(reverseWords(s));

    }
}
