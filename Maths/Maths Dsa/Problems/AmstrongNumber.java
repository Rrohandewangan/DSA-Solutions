public class AmstrongNumber {
    
    static boolean isArmStrong(int n) {
        int copy = n ;
        int sumOfCubes = 0 ;
        
        while(n > 0) {
            int dig = n  % 10 ;
            sumOfCubes += (dig * dig * dig) ;

            n = n / 10 ;
        }

        return sumOfCubes == copy ? true : false ;
    }
    public static void main(String[] args) {
        
        System.out.println(isArmStrong(153));
    }
}
