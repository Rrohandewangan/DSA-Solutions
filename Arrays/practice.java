import java.util.* ;
public class practice{

    public static int countNumber(int n) {
        int count = 0 ;
        while(n > 0) {
            count = count+1 ;

            n = n / 10 ;
        }
       return count ;
    }
    public static void main(String[] args) {
       int n = 12345 ;
       
       int ans = countNumber(n) ;
       System.out.println(ans);
    }
}