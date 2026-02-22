public class RemoveutermostParanthesis {

  public static String removeOuterParentheses(String s) {
        int n = s.length() ;
        StringBuilder sb = new StringBuilder() ;
        int cnt = 0 ; // count number of opening and closing brackets 
        
        // everytime outermost '(' at cnt = 1 and ')' at cnt = 0 that why we doing cnt++ and cnt-- before checking its outermost or not 
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i) ;
            if(ch == '(') {
                if(cnt > 0) {
                    sb.append(ch) ;
                }
                cnt++ ;
            } else {
                cnt-- ;
                if(cnt > 0) {
                  sb.append(ch) ;
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