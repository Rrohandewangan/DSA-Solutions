public class FindHighestAlti {

    // optimal approach -> 2 passes + extra space
    // TC -> O(n)
    // SC -> O(n)
    // public int largestAltitude(int[] gain) {
    //     int n = gain.length ;
    //     int[] alti = new int[n+1] ;

    //     // to store the altitude b/t two indexs using prefix sum
    //     for(int i=1; i<alti.length; i++) {
    //         alti[i] = gain[i-1] + alti[i-1] ;
    //     }

    //     int maxAlti = Integer.MIN_VALUE ;
    //     for(int i=0; i<alti.length; i++) {
    //        maxAlti = Math.max(maxAlti, alti[i]) ;
    //     }

    //     return maxAlti ;
    // }

   
    // optimal approach ->
     // TC -> O(n)
    // SC -> O(1)
    public int largestAltitude(int[] gain) {
        int currAlti = 0 ;
        int maxAlti =  0 ;

        for(int i=0; i<gain.length; i++) {
            currAlti += gain[i] ;
            maxAlti = Math.max(currAlti, maxAlti) ;
        }
        
        return maxAlti ;
    }
    public static void main(String[] args) {
        
    }
}