import java.util.Arrays; 

public class AggresiveCows {

//   static boolean isPossible(int[] arr, int N, int C, int minAllowedDis) { // O(n)
//      int n = arr.length ;
//      int cows = 1, lastStallPos = arr[0] ;
//      for(int i=0; i<n; i++) { // O(n)
//       if((arr[i] - lastStallPos) >= minAllowedDis) {
//           cows++ ;
//           lastStallPos = arr[i] ;
//       }
//       if(cows == C) {
//         return true ;
//       }
//      }
//      return false ;
//   }
 
//   // Tc -> O(nlogn)+O(arr[max]-arr[min]* n)

//   // static int getDistance(int[] arr, int N, int C) {
//   //   Arrays.sort(arr) ;  //O(nlogn)
//   //   int n = arr.length ;
    
//   //   int high = arr[n-1] - arr[0] ;
//   //   int low = 1 ;
//   //   for(int i=high; i>=1; i--) { // O(arr[max]-arr[min]* n)
//   //       if(isPossible(arr, N, C, i)) {
//   //         return i ;
//   //       }
//   //   }
//   //   return -1 ;
//   // }

  
//   // Tc -> O(nlogn)+O(log(arr[max]-arr[min]* n))
  
//   static int getDistance(int[] arr, int N, int C) {
//     Arrays.sort(arr);
//     int n = arr.length ;

//     int st = 1, end = arr[n-1] - arr[0], ans = -1 ;

//     while (st <= end) {
//       int mid = st+(end-st)/2 ;
      
//       if(isPossible(arr, N, C, mid)) {
//         ans = mid ;
//         st = mid+1 ;
//       } else {
//         end = mid-1 ;
//       } 
//   }
//   return ans ;
// }


// 2nd time solve 

static boolean isPossible(int[] arr, int N ,int C, int minAllowedDis) { //O(N)
      int cows = 1, lastStallPos = arr[0] ;

      for(int i=0; i<N; i++) {
          if(arr[i] - lastStallPos >= minAllowedDis) {
              cows++ ;
              lastStallPos = arr[i] ;
          }
      }

      if(cows == C) {
        return true ;
      }

      return false ;
}


public static int getDistance(int[] arr, int N, int C) {

  Arrays.sort(arr) ; // O(NlogN)

  int st = 1, end = arr[N-1] - arr[0], ans = -1 ;

  while(st <= end) { // O(log(Range) * N) 
    int mid = st + (end - st) / 2 ;

    if(isPossible(arr, N, C, mid)) {
      ans = mid ;
      st = mid + 1 ;
    } else {
      end = mid - 1 ;
    }
  }
  return ans ;
}
  public static void main(String[] args) {
      int arr[] = {1, 2, 8, 4, 9} ;
      int N = 5 ;
      int C = 3 ;

      System.out.println(getDistance(arr, N, C));
    }
}

    
   
  