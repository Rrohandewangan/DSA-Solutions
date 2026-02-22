import java.util.* ;
public class ReverseString {
    
    public static void reverseString(char[] s) {
        int n = s.length;
        int st=0, end=n-1 ;
 
        while(st <= end) {
            char temp = s[st] ;
            s[st] = s[end] ;
            s[end] = temp ;
            st++; end-- ;

        }
    }
    public static void main(String[] args) {
        
       char[] s = {'r', 'o', 'h', 'a', 'n'} ;
      reverseString(s);
      System.out.println(Arrays.toString(s));
    }
}
