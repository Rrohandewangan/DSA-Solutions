public class minDaysToMakeBouquets {
     
    // TC -> O((bloomday[max]- bloomDay[min]+1)* N)

    // public static boolean isPossible(int bloomDay[], int day, int m , int k) {
    //       int n = bloomDay.length ;
    //       int cnt = 0 ;
    //       int noOfB = 0 ;
    //       for(int i=0; i<n; i++) {
    //         if(bloomDay[i] <= day) {
    //             cnt++ ;
    //         } else {
    //             noOfB += Math.floor(cnt/k) ;
    //             cnt = 0 ;
    //         }
    //       }
    //       noOfB += Math.floor(cnt/k) ;
    //       if(noOfB >= m) {
    //         return true ;
    //       } else {
    //         return false ;
    //       }

    // }
  
    // public static int minDays(int[] bloomDay, int m, int k) {
    //     int n = bloomDay.length ;
    //     int val = m * k ;
    //     if(val > n) {
    //         return -1 ;
    //     }
    //     int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE ;
    //     for(int i=0; i<n; i++) {
    //         min = Math.min(min, bloomDay[i]) ;
    //         max = Math.max(max, bloomDay[i]) ;
    //     }

    //     for(int i=min; i<=max; i++) {
    //         if(isPossible(bloomDay, i, m, k)) {
    //             return i ;
    //         }
    //     }
    //     return -1 ;
    // }
 

    // TC -> O(log(bloomDay(max)- bloomDay(min)+1)*N) 
    
    public static boolean isPossible(int bloomDay[], int day, int m , int k) {
         int n = bloomDay.length ;
         int cnt = 0 ;
         int noOfB = 0 ;

         for(int i=0; i<n; i++) {
           if(bloomDay[i] <= day) {
               cnt++ ;
           } else {
               noOfB += (cnt/k) ;
               cnt = 0 ;
           }
         }
         noOfB += (cnt/k) ;
          if(noOfB >= m) {
           return true ;
         } else {
           return false ;
         }
        }
     
    public static int minDays(int[] bloomDay, int m, int k) {
            int n = bloomDay.length ;
            long val = (long) m * k ;
            if(val > n) {
                return -1 ;
            }
            int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE ;
            for(int i=0; i<n; i++) {
                min = Math.min(min, bloomDay[i]) ;
                max = Math.max(max, bloomDay[i]) ;
            }
            int st = min , end = max ;
            while(st <= end) {
             int mid = st+(end-st)/2 ;

             if(isPossible(bloomDay, mid, m, k)) {
                end = mid-1 ;
             } else {
                st = mid+1 ;
             }
            }
            return st ;
        
        }
    
        
    public static void main(String[] args) {
      int[] bloomDay = {1,10,3,10,2} ;
      int m = 3 ;
      int k = 1 ;
      System.out.println(minDays(bloomDay, m, k));
    }
}
