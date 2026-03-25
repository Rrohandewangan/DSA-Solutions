public class GuessNumber {
    
    // TC -> O(logn)
    // SC -> O(1)
    public int guessNumber(int n) {
        int st = 1, end = n ;
        while(st <= end) {
            int mid = st + (end - st)/ 2 ;
            int ans = guess(mid) ;

            if(ans == 0) {
                return mid ;
            } else if(ans == -1) {
                end = mid - 1 ;
            } else {
                st = mid + 1 ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        
    }
}
