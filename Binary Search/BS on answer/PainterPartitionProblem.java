public class PainterPartitionProblem {

// public static boolean isPossible(int[] arr, int n, int k, int minReqTime) {
//    if( k > n) { // allocation of board is not possible
//       return false ;
//    }
//    int painters = 1, reqTime = 0 ;
//    for(int i=0; i<n; i++) { // to check possibility of reqtime O(n)
//        if(arr[i] > minReqTime) { // individual time > minReqtime
//          return false ;
//        }

//        if(reqTime+arr[i] <= minReqTime) {
//            reqTime += arr[i] ;
//        } else {
//           painters++ ;
//           reqTime = arr[i] ;
//        }
//    }
//    if(painters > k) {
//       return false ;
//    } else {
//       return true ;
//    }
// }

// TC -> O((sum(arr)-maxVal(arr)+1)*n)
// public static int minTimeToPaint(int[] arr, int n, int k) {
//    int maxVal = Integer.MIN_VALUE ; // maxVal is max element of array 
//    int sum = 0 ; // sum of array

//    for(int i=0; i<n; i++) { // O(n)
//       maxVal = Math.max(maxVal, arr[i]) ;
//       sum += arr[i] ;
//    }

//    for(int i=maxVal; i<=sum; i++) { // search possible range of min time required O((sum-maxVal+1)*n)
//       if(isPossible(arr, n, k, i)) {
//          return i ;
//       }

//    }
//    return maxVal ;
// }


//   // TC -> O(log((sum-maxVal+1)*n))
//    public static int minTimeToPaint(int[] arr, int n, int k) {
//       int maxVal = Integer.MIN_VALUE ; // max element of array
//       int sum = 0 ; // sum of array
//       for(int i=0; i<n; i++) {
//          maxVal = Math.max(maxVal, arr[i]) ;
//          sum += arr[i] ;
//       }

//       int st=maxVal, end=sum, ans = -1 ;
//       while(st <= end) {  // possible range of answer of required time  O(log((sum-maxVal+1)*n))
//          int mid = st+(end-st)/2 ;
//          if(isPossible(arr, n, k, mid)) {
//              ans = mid ;
//              end = mid-1 ;
//          } else {
//             st = mid+1 ;
//          }
//       }
//       return ans ;
//    }



// 2nd time solve ->

public static boolean isPossible(int[] arr, int n, int k, int maxAllowedTime) { // O(n)
   int painters = 1, time = 0 ;

   for(int i=0; i<n; i++) {

      if(arr[i] > maxAllowedTime) {
         return false ;
      }

      if(time + arr[i] <= maxAllowedTime) {
         time += arr[i];
      } else {
         painters++ ;
         time = arr[i] ;
      }
   }

   return  painters > k ? false : true ;
}

// TC -> O(log(range) * n))
public static int minTimeToPaint(int[] arr, int n, int k) {
   int sum = 0, maxVal = Integer.MIN_VALUE ;

   for(int i=0; i<n; i++) { // O(n)
      sum += arr[i] ;
      maxVal = Math.max(maxVal, arr[i]) ;
   }

   int st = maxVal, end = sum, ans = -1 ; // range -> maxval to sum of array ;
   // TC -> O(log(range) * n)
   while(st <= end) {
      int mid = st + (end - st)/ 2 ;

      if(isPossible(arr, n, k, mid)) {
         ans = mid ;
         end = mid - 1; 
      } else {
         st = mid + 1 ;
      }
   }
   return ans ;
}
    public static void main(String[] args) {
       int[] arr = {40, 30, 10, 20 } ;
       int n = 4, k = 2 ;

       System.out.println(minTimeToPaint(arr, n, k));
    }
}
