public class ReverseString {
    
    // TC -> O(n)
    // SC -> O(n)
      static void helper(char[] s, int st, int end) {
        if(st > end) {
            return ;
        }

         if(st <= end) {
            char temp = s[st] ;
            s[st] = s[end] ;
            s[end] = temp ;
         }
         helper(s, st+1, end-1) ;
      }
    public static void main(String[] args) {
        
    }
}
