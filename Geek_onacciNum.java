public class Geek_onacciNum {
    
    // Tc -> O(3pow(n))
    // SC -> O(n)
    public static void main(String[] args) {
        System.out.println(geekonacci(1, 3, 2, 5));
    }

    static int geekonacci(int a, int b, int c, int n) {
        if(n == 1) return a ;
        if(n == 2) return b ;
        if(n == 3) return c ;

        return geekonacci(a, b, c, n - 1) + geekonacci(a, b, c, n-2) + geekonacci(a, b, c, n - 3) ;
    }
}
