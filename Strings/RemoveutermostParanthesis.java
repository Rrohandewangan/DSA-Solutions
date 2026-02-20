public class RemoveutermostParanthesis {

public static String removeOuterParentheses(String s) {
     int cnt = 0 ;
     StringBuilder sb = new StringBuilder() ;

     for(int i=0; i<s.length(); i++) {

       char ch = s.charAt(i) ;

       if(ch == '(' ) {
        if(cnt > 0) {
          sb.append(ch) ; }
          cnt += 1 ;
       } else {
        if(ch == ')') { 
            cnt -= 1 ;
          if(cnt > 0) {
            sb.append(ch) ;
          }
        } 
       
       }
     }

     return sb.toString() ;
 

}
    public static void main(String[] args) {
       String s = "(()())(())" ;
       System.out.println(removeOuterParentheses(s));
    }
}