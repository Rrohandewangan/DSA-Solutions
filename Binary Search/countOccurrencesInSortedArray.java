public class countOccurrencesInSortedArray {
    
    // TC -> O(n)
    // public static int countOccurrencesInSortedArray(int[] arr, int N, int X) {
    //      int count = 0 ;
    //      for(int i=0; i<N; i++) {
    //         if(arr[i] == X) {
    //             count++ ;
    //         }
    //      }
    //      return count ;
    // }

    // public static int findFirstIndex(int N, int X, int[] arr) {
    //      int st=0, end=N-1 ;
    //      int index = -1 ;
    //      while(st <= end) {
    //        int mid = st+(end-st)/2 ;
           
    //        if(arr[mid] >= X) {
    //         end = mid-1 ;
    //        } else {
    //          st = mid+1 ;
    //        }

    //        if(arr[mid] == X) {
    //         index = mid ;
    //        }
    //      }
    //      return index ;
    // }
    // public static int findLastIndex(int N, int X, int[] arr) {
    //      int st=0, end=N-1 ;
    //      int index = -1 ;
    //      while(st <= end) {
    //        int mid = st+(end-st)/2 ;
           
    //        if(arr[mid] <= X) {
    //          st = mid+1 ;
    //        } else {
    //         end = mid-1 ;
    //        }

    //        if(arr[mid] == X) {
    //         index = mid ;
    //        }
    //      }
    //      return index ;
    // }

    // public static int findOccurrencesInSortedArray(int N, int X, int[] arr) {
    //     int firstOcc = findFirstIndex(N, X, arr) ;
    //     int lastOcc = findLastIndex(N, X, arr) ;

    //     int Occurrence = (lastOcc - firstOcc + 1) ;
    //     return Occurrence ;
    // }


    //solve 2nd times

    public static int findOccurrencesInSortedArray(int[] arr, int target, int N) {
      int firstIndex = firstIndex(arr, target, N) ;
      int lastIndex = lastIndex(arr, target, N) ;

      int ans = lastIndex - firstIndex + 1 ;

      return ans ;
    }


    // find first occurrence of target in array
    public static int firstIndex(int[] arr, int target, int N) {
     
      int st = 0, end = N - 1 ;
      int ans = -1 ;

      while(st <= end) {
        int mid = st + (end - st)/2 ;

        if(target <= arr[mid]) {
          end = mid - 1 ;
        } else if(target > arr[mid]) {
          st = mid + 1 ;
        }

        if(target == arr[mid]) {
          ans = mid ;
        }
      }
      return ans ;
    }

    // find last occurrence of target in array
    public static int lastIndex(int[] arr, int target, int N) {
      int n = arr.length ;
      int st = 0, end = N - 1 ;
      int ans = -1 ;

      while(st <= end) {
        int mid = st + (end - st)/2 ;

        if(target < arr[mid]) {
          end = mid - 1 ;
        } else if(target >= arr[mid]) {
          st = mid + 1 ;
        }

        if(target == arr[mid]) {
          ans = mid ;
        }
      }
      return ans ;
    }

    public static void main(String[] args) {
       int N = 7, target = 3 ;
       int arr[] = {2,2,3,3,3,3,4,4} ;
      
       System.out.println(findOccurrencesInSortedArray(arr, target, N));

    }
}
