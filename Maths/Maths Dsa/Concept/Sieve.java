public class Sieve {

    // TC -> O(n * log(logn))
    // SC -> O(n )

    //Sieve of Eratosthenes – algorithm to find prime numbers.
    
    // false in array means number is prime 
    static void sieve(int n, boolean[] primes) {
        for(int i = 2; i * i <= n; i++) {
            if(!primes[i]) {
                for(int j = i*i; j <= n; j += i) {
                        primes[j] = true ;
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            if(!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 37 ;
        boolean[] primes = new boolean[n+1] ;
        sieve(n, primes);
    }
}
