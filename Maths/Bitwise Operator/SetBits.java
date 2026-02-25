
public class SetBits {

    public static int setBits(int n ) {
        int cnt = 0 ;

        // while(n > 0) {
        //     cnt++ ;
        //     n -= (n & (-n)) ;
        // }

        while(n > 0) {
            cnt++ ;
            n = n & (n - 1) ;
        }
        return cnt ;
    }
    
    public static void main(String[] args) {
        int n = 196  ;

        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
        
    }
}
