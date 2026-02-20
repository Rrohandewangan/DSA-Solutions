import java.util.* ;
public class UpperAndLowerBound {
 
 // Time Complexity -> O(n)
//  public static int upperBound(int arr[], int N, int x) {
//     for(int i=0; i<N; i++) {
//       if(arr[i] > x) {
//         return i ;
//       }
//     }
//     return N ;
//  }
//  public static int lowerBound(int arr[], int N, int x) {
//     for(int i=0; i<N; i++) {
//       if(arr[i] >= x) {
//         return i ;
//       }
//     }
//     return N ;
//  }

// Time Complexity -> O(logn)
// public static int upperBound(int[] arr, int N, int x) {
//   int st = 0, end = N-1, ans = -1;
//   while(st <= end) {
//     int mid = st+(end-st) / 2 ;
//     if(arr[mid] > x ) {
//       ans = mid ;
//       end = mid-1 ;
//     } else {
//      st = mid+1 ;
//     }
//   }
//   return ans ;
// }
// public static int lowerBound(int[] arr, int N, int x) {
//   int st = 0, end = N-1, ans = -1;
//   while(st <= end) {
//     int mid = st+(end-st) / 2 ;
//     if(arr[mid] >= x ) {
//       ans = mid ;
//       end = mid-1 ;
//     } else {
//      st = mid+1 ;
//     }
//   }
//   return ans ;
// }
    public static void main(String[] args) {
      int N = 5 ;
      int arr[] = {3,5,8,15,19} ;
      int x = 9 ;

      System.out.println(lowerBound(arr, N, x));
    }
}

