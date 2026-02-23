public class RotateWordInString {

  //https://leetcode.com/problems/reverse-words-in-a-string/description/

    
     public static String reverseWords(String s) {
        int n = s.length() ;
        StringBuilder sb = new StringBuilder(s) ;
        StringBuilder ans = new StringBuilder("") ;

        sb.reverse() ; // to reverse given string 

        for(int i=0; i<n; i++) {
            StringBuilder word = new StringBuilder("") ; // to store each word of string
            
        while(i < n && sb.charAt(i) != ' ') {
              word.append(sb.charAt(i)) ;
              i++ ;
        }

      // method 1 ->
        // word.reverse() ; // to reverse each word come from after while loop runs.

        // if(word.length() > 0) {
        //     ans.append(" " + word) ;
        // }
        // }
        // ans.toString() ;

        // return ans.substring(1) ;

       // method 2 ->
        if(word.length() > 0) {
            if(ans.length() > 0) {
                ans.append(' ');
            }
            ans.append(word.reverse()) ;
        }  
    }
    return ans.toString() ;
 } 

    public static void main(String[] args) {
      String s = "the sky is blue" ;
      System.out.println(reverseWords(s));

    }
}
