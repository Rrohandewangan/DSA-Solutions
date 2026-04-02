public class ArrangingCoins {
    
 // TC -> O(logn)
    // SC -> O(1)
    public int arrangeCoins(int n) {
        int st = 0, end = n ;
        while(st <= end) {
            int mid = st + (end - st)/ 2 ;
            long coins = (long)mid * ( mid + 1)/ 2 ;

            if(coins <= n) {
                st = mid + 1 ;
            } else {
                end = mid - 1 ;
            }
        }
        return end ;
    }

    public static void main(String[] args) {
        
    }

}
