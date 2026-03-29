public class SumUpToZero {
    
    // TC -> O(n)
    // SC -> O(n)
    public int[] sumZero(int n) {
        int[] arr = new int[n] ;
        int idx = 0 ;

        for(int i=1; i<=n/2; i++) {
            arr[idx++] = i ;
            arr[idx++] = -i ;
        }

        if(n % 2 == 1) {
            arr[idx] = 0 ;
        }

        return arr ;
    }
    public static void main(String[] args) {
        
    }
}
