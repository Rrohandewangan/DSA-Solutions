public class StringCompression {
    
    public static int compress(char[] chars) {
         int n = chars.length ;
         int idx = 0 ;
         for(int i=0; i<n; i++) {
            char ch = chars[i] ;
            int cnt = 0;
           while(i < n && chars[i] == ch) {
             cnt++; i++ ;
            }
            
            if(cnt == 1) {
            chars[idx++] = ch ;
          } else {
            chars[idx++] = ch ;
             String str = Integer.toString(cnt) ;
             for(char dig : str.toCharArray()) {
                 chars[idx++] = dig ;
              }
          }
          i-- ;
         }
        
      return idx ;
    }
    public static void main(String[] args) {
      char[] chars = {'a','a','b','b','c','c','c'} ;
      System.out.println(compress(chars));
    }
}
