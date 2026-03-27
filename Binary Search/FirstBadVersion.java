public class FirstBadVersion {

    //  TC -> O(logn)
    //  SC -> O(1)
    public int firstBadVersion(int n) {
        int st = 1, end = n, ans = 0 ;
        while(st <= end) {
            int mid = st + (end - st) / 2 ;

            if(isBadVersion(mid)) {
                ans = mid ;
                end = mid - 1 ;
            } else {
                st = mid + 1 ;
            }
        }
        return ans ;
    }


    
    public static void main(String[] args) {
        
    }
}