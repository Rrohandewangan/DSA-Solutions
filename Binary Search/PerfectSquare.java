public class PerfectSquare {
    
    // TC -> O(logn)
    // SC -> O(1)
    public boolean isPerfectSquare(int num) {

        if(num < 2) {
            return true ;
        }
        int st = 0, end = num / 2 ;
        while(st <= end) {
            int mid = st + (end - st)/ 2 ;
            if((long) mid * mid == num) {
                return true ;
            } else if((long)mid * mid > num) {
                end = mid - 1 ;
            } else {
                st = mid + 1 ;
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        
    }
}
