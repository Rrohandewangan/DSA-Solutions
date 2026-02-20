public class KokoEatsBanana {
    
    // TC -> O(max(piles) * n) 
    // public static int calculateMaxK(int[] piles) {
    //     int n = piles.length ;
    //     int max = Integer.MIN_VALUE ;
    //     for(int i=0; i<n; i++) {
    //       max = Math.max(piles[i], max) ;
    //     }
    //     return max ;
    // }

    // public static int funcOfTime(int[] piles, int hourly) {
    //     int n = piles.length ;
    //     int totalTime = 0 ;
    //     for(int i=0; i<n; i++) {
    //       totalTime += Math.ceil((double)piles[i] / (double)hourly) ;
    //     }
    //     return totalTime ;
    // }

    // public static int minTimeReqToEatPiles(int[] piles, int  h) {
    //    int maxPossibleK = calculateMaxK(piles) ;
    //   for(int i=1; i<=maxPossibleK; i++) {
    //      int reqTime = funcOfTime(piles, i) ;
        
    //      if(reqTime <= h) {
    //         return i ;
    //      }
    //   }

    //   return maxPossibleK ;
      
    // }
   

    // TC -> O( n * log(max(piles)))

      public static int calculateMaxK(int[] piles) {
        int n = piles.length ;
        int max = Integer.MIN_VALUE ;
        for(int i=0; i<n; i++) {
          max = Math.max(piles[i], max) ;
        }
        return max ;
    }

    public static int funcOfTime(int[] piles, int hourly) {
        int n = piles.length ;
        int totalTime = 0 ;
        for(int i=0; i<n; i++) {
          totalTime += Math.ceil((double)piles[i] / (double)hourly) ;
        }
        return totalTime ;
    }

    public static int minTimeReqToEatPiles(int[] piles, int h) {
        int maxPossibleK = calculateMaxK(piles) ;
        int st=1, end=maxPossibleK ;

        while(st <= end) {
          int mid = st+(end-st)/2 ;
          int reqTime = funcOfTime(piles, mid) ;

          if(reqTime <= h) {
            end = mid-1 ;
          } else {
            st = mid+1 ;
          }
        }
        return st ;
    }
    public static void main(String[] args) {
     int[] piles = {25, 12, 8, 14, 19};
     int h = 5 ;
     System.out.println(minTimeReqToEatPiles(piles, h));
    }
}
