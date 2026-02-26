 public class GCD {
    
    // // brute force Method -> 
    // // TC -> O(min(a, b))
    // // SC -> O(1)
    // static int gcd(int a, int b) {
    //     if(a == 0) {
    //         return b ;
    //     }
    //     if(b == 0) {
    //         return a ;
    //     }

    //     int gcd = 1 ;
    //     for(int i=1; i<=Math.min(a, b); i++) {
    //         if(a % i == 0 && b % i == 0) {
    //             gcd = i ;
    //         }
    //     }
    //     return gcd ;
    // }


     // optimal Method ->  Euclid's Algorithm
    // TC -> 
    // SC -> O(1)
    static int gcd(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) {
                a = a % b ;
            } else {
                b = b % a ;
            }
        }

        if(a == 0) {
            return b ;
        }
        return a ;
       
    }
    public static void main(String[] args) {
        System.out.println(gcd( 6, 12));
    }
}
