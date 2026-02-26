import java.util.Arrays;

public class CountPrimes {
    
    // method - 1 
    // TC -> O(n * log(logn))
    // SC -> O(n)
    //   public int countPrimes(int n) {
    //     boolean[] isPrime = new boolean[n+1] ;
    //     int count = 0 ;

    //     for(int i = 2; i * i < n; i++) {
    //         if(!isPrime[i]) {
    //             for(int j = i*i; j < n; j += i) {
    //                     isPrime[j] = true ; // check mutilples and mark not prime = true.
    //             }
    //         }
    //     }

    //     for(int i = 2; i < n; i++) {
    //         if(!isPrime[i]) { // false = prime
    //             count++ ;
    //         }
    //     }
    //     return count ;
    // } 


    // method - > 2
     // TC -> O(n * log(logn))
    // SC -> O(n)
    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n+1] ;
        Arrays.fill(isPrime, true) ;
        int count = 0 ;

        //run a loop
        for(int i=2; i<n; i++) {
            if(isPrime[i]){
                count++ ;

                // check multiples of i and mark non prime number
                for(int j = i * i; j < n; j += i) {
                    isPrime[j] = false ;
                }
            } 
        } 
         return count ;
    }  
    public static void main(String[] args) {
        // int n = 10 ;
        System.out.println(countPrimes(10));
    }
}
