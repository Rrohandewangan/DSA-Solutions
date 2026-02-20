public class CapacityToTheShipWithinDays {
   
    // TC -> O(N*(sum(weights[])-max(weights[])+1))
//     public static int findDays(int[] weights, int weightsCap) {
//         int n = weights.length ;
//         int reqDays = 1 ;
//         int load = 0 ;
//         for(int i=0; i<n; i++) {
//          if(load + weights[i] > weightsCap) {
//             reqDays += 1 ;
//             load = weights[i] ;
//          } else {
//             load = load + weights[i] ;
//          }
//     }
//     return reqDays ;
// }
    
//   public static int shipWithinDays(int[] weights, int days) {
//      int n = weights.length ;
//      int minWCap = Integer.MIN_VALUE ;
//      int maxWCap = 0 ;
//      for(int i=0; i<n; i++) {
//        minWCap = Math.max(minWCap, weights[i]) ;
//        maxWCap += weights[i] ;
//      }

//      for(int i=minWCap; i<=maxWCap; i++) {

//        int reqDays = findDays(weights, i) ;
//         if(reqDays <= days) {
//             return i ;
//         }
//     }
//     return -1 ;
// }


// TC -> O(log(N*(sum(weights[])-max(weights[])+1)))
public static int findDays(int[] weights, int weightsCap) {
        int n = weights.length ;
        int reqDays = 1 ;
        int load = 0 ;
        for(int i=0; i<n; i++) {
         if(load + weights[i] > weightsCap) {
            reqDays += 1 ;
            load = weights[i] ;
         } else {
            load = load + weights[i] ;
         }
    }
    return reqDays ;
}
    
  public static int shipWithinDays(int[] weights, int days) {
     int n = weights.length ;
     int minWCap = Integer.MIN_VALUE ;
     int maxWCap = 0 ;
     int ans = 0 ;
     for(int i=0; i<n; i++) {
       minWCap = Math.max(minWCap, weights[i]) ;
       maxWCap += weights[i] ;
     }

    int st=minWCap, end=maxWCap ;
    while(st <= end) {
        int mid = st+(end-st)/2 ;
        int reqDays = findDays(weights, mid) ;

        if(reqDays <= days) {
          ans = mid ;
          end = mid-1 ;
        } else {
            st = mid+1 ;
        }
    }
    return ans ;
}
    public static void main(String[] args) {
      int[] weights = {1,2,3,4,5,6,7,8,9,10} ; int days = 5 ;
      
      System.out.println(shipWithinDays(weights, days));
    }
}
