public class StringCompression {
    
     public static int compress(char[] chars) {
        int n = chars.length ;
        int idx = 0 ;

        // run a loop on array
        for(int i=0; i<n; i++) {
           char ch = chars[i] ;
            int cnt = 0 ;

           while(i < n && chars[i] == ch) { // count the occurence of char in array
                cnt++; i++ ; 
            }
            // check if count == 1
            if(cnt == 1) {
                chars[idx++] = ch ;
            } else { // if character count is greater then 1 so first store char and store its count 
                chars[idx++] = ch ;
                String str = Integer.toString(cnt) ; // convert integer to string
                // run a loop on string
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
