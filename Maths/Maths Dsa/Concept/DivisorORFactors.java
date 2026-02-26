public class DivisorORFactors {
    
    // brute force approach -> 
    // TC -> O(n)
    // SC -> O(1)
    static void divisor1(int n) {
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    // optimal approach -> 
    // TC -> O(sqrt(n))
    // SC -> O(1)
    static void divisor2(int n) {
        for(int i=1; i * i <= n; i++) {
            if(n % i == 0) {
                if(n / i == i) {
                    System.out.println(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
                
            }
        }
    }
    public static void main(String[] args) {
        divisor1(20);
    }
}
